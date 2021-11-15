package com.pb.Kazachuk.HW7;

public abstract class Clothes {

    private final Size size;
    private final float price;
    private final String color;

    public Clothes(final Size size, final float price,final String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getTextForPrint(final String name) {
        return name +
                ":\n" +
                "Размер: " +
                getSize().getEuroSize() +
                ", " +
                getSize().getDescription() +
                "\nЦена: " +
                getPrice() +
                "\nЦвет: " +
                getColor() + "\n";
    }
}
