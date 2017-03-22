package ru;

public class Main {
    public static void main(String[] args){
        NumberGenerator numberGenerator = null;
        BookService bookService = new BookService(numberGenerator);
        System.out.println(bookService.createBook("Название книги", (float) 12.0, "Описание книги"));
    }
}
