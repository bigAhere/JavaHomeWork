package com.pb.Kazachuk.HW3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt( 101);

        Scanner in = new Scanner(System.in);
        int userVarriable;
        String wantToContinue = "";

        //System.out.println("rand: " + x);
        System.out.println("The computer conceived a number. Guess him");

        int tryCount = 0;

        do{
            tryCount++;

            System.out.print("Input your number: ");
            userVarriable = in.nextInt();

            if (userVarriable == x ) {
                System.out.println("Your are win from " + tryCount + " try");
                break;
            }
            else if (userVarriable < x ) {
                System.out.println("You insert a number which less that conceived");
            }
            else if (userVarriable > x ) {
                System.out.println("You insert a number which more that conceived");
            }

            System.out.println("Do you want to continue? Y/N");
            wantToContinue = in.next();

        }
        while (wantToContinue.equals("y"));
        System.out.println("Game over");
    }
}
