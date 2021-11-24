package com.pb.Kazachuk.HW9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FileNumbers {
    public static void main(String[] args) {
        try {
            File file = createNumbersFile();
            createOddNumbersFile(file);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static File createNumbersFile() throws IOException{
        File filePath = new File("Files");
        filePath.mkdir();
        File file = new File(filePath + "\\numbers.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dataToSave = "";

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 10; j++){
                int randomNum = ThreadLocalRandom.current().nextInt(1, 99);

                if(!(j==9)){
                    dataToSave += randomNum + " ";
                } else {
                    dataToSave += randomNum + "\n";
                }
            }
        }

        Writer writer = new FileWriter(file);
        writer.write(dataToSave);
        writer.close();

        return file;
    }

    public static void createOddNumbersFile(File file) throws IOException {
        Reader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);

        String storedData;

        int i = 1;
        while (scanner.hasNextLine()) {
            storedData = scanner.nextLine();

            String[] storeDataArray = storedData.split(" ");
            List<String> lines = Files.readAllLines(file.toPath());

            for (int j = 0; j < storeDataArray.length; j++){
                if(Integer.parseInt(storeDataArray[j])%2 == 0){
                    storeDataArray[j] = "0";
                }
            }

            StringBuilder builder = new StringBuilder();

            for (String value : storeDataArray) {
                builder.append(value + " ");
            }
            String text = builder.toString();

            lines.set(i-1, text);
            Files.write(file.toPath(), lines);

            i++;
        }

        reader.close();
    }
}
