package com.pb.Kazachuk.HW4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] arg) {
        String userPhrase;
        String anagram;

        Scanner in = new Scanner(System.in);

        System.out.print("Input your phrase 1: ");
        userPhrase = in.nextLine();
        userPhrase = removeSymbols(userPhrase);

        System.out.print("Input your phrase 2 - anagram: ");
        anagram = in.nextLine();
        anagram = removeSymbols(anagram);

        if (userPhrase.equals(anagram)){
            System.out.println("Oh! These phrases is Anagram!");
        }
        else {
            System.out.println("Oh! These phrases is not Anagram!");
        }
    }

    public static String removeSymbols(String phrase){
        String cutPhrase;

        cutPhrase = phrase.replaceAll(" ","").toLowerCase();
        //cutPhrase = cutPhrase.replaceAll("[^a-zA-Z ]", "");
        cutPhrase = cutPhrase.replaceAll("[^а-яА-Я ]", "");

        char[] letter = cutPhrase.toCharArray();
        Arrays.sort(letter);
        return new String(letter);
    }
}


