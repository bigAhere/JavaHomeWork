package com.pb.Kazachuk.HW6;

public class Dog extends Animal{

    String dogSpecial = "преданность";

    @Override
    public void makeNoise(){
        System.out.println("идем гулять, хозяин");
    }

    @Override
    public void eat(){
        System.out.println("покорми пожалуйста, гав");
    }

    @Override
    public String toString(){

        return this.dogSpecial;
    }

    @Override
    public boolean equals(Object animal){
        System.out.println("Is dog equal?");
        return this == animal;
    }

    @Override
    public int hashCode(){
        return 21;
    }
}
