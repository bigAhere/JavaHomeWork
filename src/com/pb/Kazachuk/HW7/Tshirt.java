package com.pb.Kazachuk.HW7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(getTextForPrint("Мужская футболка"));
    }

    @Override
    public void dressWomen() {
        System.out.println(getTextForPrint("Женская футболка"));
    }
}
