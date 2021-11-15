package com.pb.Kazachuk.HW7;

public class Atelier {

    public static void main(String[] args) {
        int fullSize = Factory.createPants().length +
                Factory.createTshirts().length + Factory.createTies().length + Factory.createSkirts().length;

        Clothes[] clothes = new Clothes[fullSize];
        int count = 0;
        do {
            try {
                for (Clothes item :
                        Factory.createTshirts()) {
                    clothes[count] = item;
                    count++;
                }
                for (Clothes item :
                        Factory.createPants()) {
                    clothes[count] = item;
                    count++;
                }
                for (Clothes item :
                        Factory.createSkirts()) {
                    clothes[count] = item;
                    count++;
                }
                for (Clothes item :
                        Factory.createTies()) {
                    clothes[count] = item;
                    count++;
                }
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        } while (count < fullSize);

        dressMan(clothes);
        dressWoman(clothes);
    }

    private static void dressMan(final Clothes[] clothes) {
        System.out.println("---------------------Мужская одежда---------------------");
        for (Clothes item : clothes) {
            if (item instanceof ManClothes) {
                ((ManClothes) item).dressMan();
            }
        }
    }

    private static void dressWoman(final Clothes[] clothes) {
        System.out.println("---------------------Женская одежда---------------------");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothes) {
                ((WomenClothes) item).dressWomen();
            }
        }
    }

    private static class Factory {

        static Clothes[] createTshirts() {
            return new Clothes[]{
                    new Tshirt(Size.S, 22.2f, "Черный"),
                    new Tshirt(Size.M, 22.2f, "Зеленый"),
                    new Tshirt(Size.L, 22.2f, "Фиолетовый"),
                    new Tshirt(Size.XS, 22.2f, "Розовый"),
                    new Tshirt(Size.XXS, 22.2f, "Голубой")
            };
        }

        static Clothes[] createPants() {
            return new Clothes[]{
                    new Pants(Size.S, 12.22f, "Черный"),
                    new Pants(Size.M, 12.22f, "Зеленый"),
                    new Pants(Size.L, 12.22f, "Фиолетовый"),
                    new Pants(Size.XS, 12.22f, "Розовый"),
                    new Pants(Size.XXS, 12.22f, "Голубой")
            };
        }

        static Clothes[] createSkirts() {
            return new Clothes[]{
                    new Skirt(Size.S, 8.0f, "Черный"),
                    new Skirt(Size.M, 8.0f, "Зеленый"),
                    new Skirt(Size.L, 8.0f, "Фиолетовый"),
                    new Skirt(Size.XS, 8.0f, "Розовый"),
                    new Skirt(Size.XXS, 8.0f, "Голубой")
            };
        }

        static Clothes[] createTies() {
            return new Clothes[]{
                    new Tie(Size.S, 8.0f, "Черный"),
                    new Tie(Size.M, 8.0f, "Зеленый"),
                    new Tie(Size.L, 8.0f, "Коричневый")
            };
        }
    }
}
