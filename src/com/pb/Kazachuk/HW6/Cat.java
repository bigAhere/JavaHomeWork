package com.pb.Kazachuk.HW6;

public class Cat extends Animal{

    String catSpecial = "грация";

    @Override
    public void makeNoise(){
        System.out.println("Кот громко мяукает");
    }

    @Override
    public void eat(){
        System.out.println("Крадет со стола еду");
    }

    @Override
    public String toString(){

        return this.catSpecial;
    }

    @Override
    public boolean equals(Object animal){
        System.out.println("Is cat equal?");
        return this == animal;
    }

    @Override
    public int hashCode(){
        return 9;
    }
}
