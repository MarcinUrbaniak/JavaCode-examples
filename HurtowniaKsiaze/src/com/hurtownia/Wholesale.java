package com.hurtownia;

import java.util.List;
import java.util.Objects;

public class Wholesale {


    private List<Book> bookList;


    public Wholesale(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wholesale wholesale = (Wholesale) o;
        return Objects.equals(bookList, wholesale.bookList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookList);
    }

    @Override
    public String toString() {
        return "Wholesale{" +
                "bookList=" + bookList +
                '}';
    }
}
