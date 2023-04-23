package com.example.myapplication.newPackage;

import java.util.ArrayList;
import java.util.List;

public class BookDs {
    public List<Book> books;

    public BookDs() {
        books = new ArrayList<Book>();
        books.add(new Book("Core Java", "Programming", 350, "In English and Arabic"));
        books.add(new Book("Data Structure", "Programming", 540, "In Arabic"));
        books.add(new Book("Database", "Programming", 230, "In English"));
        books.add(new Book("American History", "Cultural Studies", 210, "In English and Arabic"));
        books.add(new Book("European Civilization", "Cultural Studies", 249, "In English"));
        books.add(new Book("Arab Thought", "Cultural Studies", 560, "In Arabic"));
        books.add(new Book("Quantum Physics", "Science", 520, "In English and Arabic"));
        books.add(new Book("Anatomy", "Medicine", 980, "In English and Arabic"));
        books.add(new Book("Biology", "Science", 110, "In Arabic"));}

    public List<Book> getBooksByTypes(String types){
        List<Book> lstBooks=new ArrayList<>();
        for(Book b:books){
            if(b.getType().equals(types)){
                lstBooks.add(b);
            }
        }
        return lstBooks;
    }
}
