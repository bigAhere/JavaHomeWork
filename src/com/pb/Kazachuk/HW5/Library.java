package com.pb.Kazachuk.HW5;

public class Library {
    public static void main(String[] args){

        Book[] books = {
                new Book("Приключения", "Иванов И. И.", 2000),
                new Book("Словарь", "Сидоров А. В", 1980),
                new Book("Энциклопедия", "Гусев К. В.", 2010)
        };

        Reader[] readers = {
                new Reader("Петров В.В.",
                        "IT", "10.10.2000", "07070032"),
                new Reader("Шкибаров Е.Е.",
                        "Развитие", "10.01.1100", "043545324"),
                new Reader("Кабанова О.К.",
                        "Бухгалтерия", "50.50.1505", "032634534")
        };

        printBooks(books);
        printReaders(readers);

        readers[0].returnBook(books.length);
        readers[0].takeBook(books);

        readers[1].takeBook(books[0].title, books[2].title);
        readers[1].takeBook(books.length - 1);

        readers[2].returnBook(books);
        readers[2].returnBook("Book one", "Book three", "Your lecture");
    }

    public static void printReaders(Reader[] readers){
        System.out.println("Readers list: ");

        for (int i = 0; i < readers.length; i++){
            System.out.println((i+1) +
                    ". " + readers[i].nameAndSurname +
                    ", cardId: " + readers[i].libraryCardNumber +
                    ", department: " + readers[i].department +
                    ", birth: " + readers[i].dateOfBirth +
                    ", phoneNumber: " + readers[i].phoneNumber);
        }
    }

    public static void printBooks(Book[] books){
        System.out.println("Books list: ");

        for (int i = 0; i < books.length; i++) {
            System.out.println((i+1) +
                    ". " + books[i].title +
                    " (" + books[i].author +
                    ") " + books[i].dataPrinted + "г.)");
        }
    }
}
