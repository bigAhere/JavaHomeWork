package com.pb.Kazachuk.HW8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        Auth auth = new Auth();

        Scanner in = new Scanner(System.in);

        System.out.print("Create your login: ");
        String login = in.nextLine();

        System.out.print("Create your password: ");
        String password = in.nextLine();
        System.out.print("Please, confirm your password: ");
        String confirmPassword = in.nextLine();

        try {
            auth.signUp(login, password, confirmPassword);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        System.out.println("Congratulations! Your " + login + " account created");

        System.out.print("Enter your login: ");
        login = in.nextLine();

        System.out.print("Enter your password: ");
        password = in.nextLine();

        try {
            auth.signIn(login,password);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.exit(1);
        }
        System.out.println("Welcome to our shop");
    }
}
