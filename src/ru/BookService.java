package ru;

/**
 * Created by vlad on 21.03.17.
 */

import javax.inject.Inject;

/**
 * Created by vlad on 21.03.17.
 */

public class BookService {

    private NumberGenerator numberGenerator;

    @Inject
    public BookService(NumberGenerator numberGenerator) {

    }


//    public BookService(NumberGenerator numberGenerator) {
//        this.numberGenerator = numberGenerator;
//    }



    Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setIsbn(numberGenerator.generateNumber());
        return book;
    }


}



