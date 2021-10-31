package com.pb.Kazachuk.HW4;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] arg) {

        String x;
        Scanner in = new Scanner(System.in);
        System.out.print("Input your phrase: ");
        x = in.nextLine();

        System.out.println("First variant " + toUp(x));

        toUpSecond(x);
    }

    public static StringBuilder toUp(String x) {
        char[] result = x.toCharArray();
        if (Character.isAlphabetic(result[0])) result[0] = Character.toUpperCase(result[0]);
        StringBuilder res = new StringBuilder("" + result[0]);
        for (int i=1; i<result.length; i++)
        {
            if (Character.isAlphabetic(result[i])
                    && !Character.isAlphabetic(result[i-1]))result[i]=Character.toUpperCase(result[i]);
            res.append(result[i]);
        }
        return res;
    }

    public static void toUpSecond(String x) {
        String output = "";
        String[] words = x.split(" ", 100);

        for (String word:words) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            output += (first + all + " ");
        }

        System.out.print("Second variant " + output);
    }
}

