package com.pb.Kazachuk.HW7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    public Pants(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(getTextForPrint("Мужские штаны"));
    }

    @Override
    public void dressWomen() {
        System.out.println(getTextForPrint("Женские штаны"));
    }
}