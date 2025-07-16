package com.bookstore.dao;

import com.bookstore.model.Book;

import java.util.List;
public interface BookDAO {
    int insert(Book book);
    int update(Book book);
    int delete(Book book);

//    List<Book> view();
    Book view(int id);
//    Book view(String name);
}
