package com.pb.Kazachuk.HW5;

public class Reader {
    static int libraryCards = 0;

    String nameAndSurname;
    int libraryCardNumber;
    String department;
    String dateOfBirth;
    String phoneNumber;

    public Reader(String nameAndSurname, String department, String dateOfBirth, String phoneNumber) {
        this.nameAndSurname = nameAndSurname;
        this.libraryCardNumber = getLibraryCardNumber();
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public Reader() {

    }

    private int getLibraryCardNumber(){

        return ++libraryCards;
    }

    public void takeBook(int count) {
        System.out.println(this.nameAndSurname + " взял " + count + " книги");
    }

    public void takeBook(String... titles) {
        System.out.print(this.nameAndSurname + " взял книги: ");
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i]);
            if (i < titles.length - 1){
                System.out.print(", ");
            }else {
                System.out.println(".");
            }
        }
    }

    public void takeBook(Book... books) {
        System.out.print(this.nameAndSurname + " взял книги: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].title + " (" + books[i].author + ") " + books[i].dataPrinted + "г.)");

            if (i < books.length - 1){
                System.out.print(", ");
            }else {
                System.out.println(".");
            }
        }
    }

    public void returnBook(int count) {
        System.out.println(this.nameAndSurname + " вернул " + count + " книги");
    }

    public void returnBook(String... titles) {
        System.out.print(this.nameAndSurname + " вернул книги: ");
        for (int i = 0; i < titles.length; i++) {
            System.out.print(titles[i]);
            if (i < titles.length - 1){
                System.out.print(", ");
            }else {
                System.out.println(".");
            }
        }
    }

    public void returnBook(Book... books) {
        System.out.print(this.nameAndSurname + " вернул книги: ");

        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].title + " (" + books[i].author + ") " + books[i].dataPrinted + "г.)");

            if (i < books.length - 1){
                System.out.print(", ");
            }else {
                System.out.println(".");
            }
        }
    }
}
