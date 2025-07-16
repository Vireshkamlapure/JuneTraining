package com.dao;

import com.model.Book;

import java.util.List;
public interface BookDAO {
    int insert(Book book);
    int update(Book book);
    int delete(Book book);

    List<Book> view();
    List<Book> view(int id);
    List<Book> view(String name);
}
