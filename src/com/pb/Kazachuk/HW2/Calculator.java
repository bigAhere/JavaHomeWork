package com.pb.Kazachuk.HW2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int operand1;
        int operand2;
        String sign;

        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        operand1 = in.nextInt();
        System.out.print("Input second number: ");
        operand2 = in.nextInt();
        System.out.print("Input operation type: ");
        sign = in.next();

        switch (sign){
            case "+":
                System.out.println("Sum is = " + (operand1+operand2));
                break;

            case "-":
                System.out.println("Difference is = " + (operand1-operand2));
                break;

            case "*":
                System.out.println("Multiplication is = " + (operand1*operand2));
                break;

            case "/":
                if (operand2==0){
                    System.out.println("Division is impossibly");
                }
                else{
                    System.out.println("Division is = " + (operand1/operand2));
                }
                break;
            default:
                System.out.println("No such operator");
        }

        //in.close();
    }
}
