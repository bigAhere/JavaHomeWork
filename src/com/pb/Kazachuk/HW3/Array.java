package com.pb.Kazachuk.HW3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] userArray = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 10 numbers to fill your array");
        for(int i = 0; i < userArray.length; i++){
            System.out.println("Enter "+ (i+1) + " number of array:");
            userArray[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(userArray));

        int arraySum = 0;
        int posElementsCount = 0;
        int negElementsCount = 0;
        for(int i = 0; i < userArray.length; i++){
            arraySum += userArray[i];

            if(userArray[i] > 0){
                posElementsCount++;
            }else if (userArray[i] < 0){
                negElementsCount++;
            }
        }
        System.out.println("Array sum of elements " + arraySum);
        System.out.println("You have " + posElementsCount + " positive elements");
        System.out.println("You have " + negElementsCount + " negative elements");

        int n = userArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (userArray[j] > userArray[j+1]) {
                    int temp = userArray[j];
                    userArray[j] = userArray[j+1];
                    userArray[j+1] = temp;
                }

        System.out.println("Sorted (thanks to google) array " + Arrays.toString(userArray));
    }
}
