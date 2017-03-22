package ru;

/**
 * Created by vlad on 21.03.17.
 */
public class Book {
    private String title;
    private Float price;
    private String description;
    private String Isbn;


    public Book(String title, Float price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return Isbn;
    }


    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", Isbn='" + Isbn + '\'' +
                '}';
    }
}