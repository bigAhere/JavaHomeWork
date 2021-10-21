package com.pb.Kazachuk.HW2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args){
        int x;

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        x = in.nextInt();

        if (x >= 0 && x <= 14) {
            System.out.println("The first interval");
        }else if (x >= 15 && x <= 35) {
            System.out.println("The second interval");
        }else if (x >= 36 && x <= 50) {
            System.out.println("The third interval");
        }else if (x >= 51 && x <= 100) {
            System.out.println("The fours interval");
        }else {
            System.out.println("Your number is unavailable in this variants");
        }
    }
}
