package com.pb.Kazachuk.HW6;

public class Horse extends Animal{

    String horseSpecial = "грива";

    @Override
    public void makeNoise(){
        System.out.println("Игого");
    }

    @Override
    public void eat(){
        System.out.println("дай овса, скакать не буду");
    }

    @Override
    public String toString(){

        return this.horseSpecial;
    }

    @Override
    public boolean equals(Object animal){
        System.out.println("Is horse equal?");
        return this == animal;
    }

    @Override
    public int hashCode(){
        return 4;
    }
}
