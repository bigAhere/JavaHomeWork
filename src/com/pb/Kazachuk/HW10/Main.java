package com.pb.Kazachuk.HW10;

public class Main {

    public static void main(String[] args) {
        NumBox<Integer> t = new NumBox<>(7);

        t.add(5);
        t.add(4);
        t.add(514);
        t.add(14);
        t.add(145);
        t.add(6);
        t.add(444);

        System.out.println("Sum = " + t.sum());
        System.out.println("Avg = " + t.average());
        System.out.println("Max = " + t.max());
        System.out.println("Len = " + t.length());
        System.out.println("Num4 = " + t.get(4));
    }
}
