package com.bookstore.dao;

import com.bookstore.model.Book;
import com.bookstore.util.HibernatesUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    SessionFactory factory = HibernatesUtil.getSessionFactory();
    Session session = factory.openSession();
    Transaction transaction = session.beginTransaction();

    @Override
    public int insert(Book book) {

        try {
            session.persist(book);
            transaction.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int update(Book book) {

        try {
            session.merge(book);
            transaction.commit();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int delete(Book book) {

        try {
            Book book1 = session.find(Book.class,book.getId());
            session.remove(book1);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

//    @Override
//    public List<Book> view() {
//
//        List<Book> books = new ArrayList<>();
//
//        try {
//            Statement statement = DBUtil.getConnection().createStatement();
//            String sql = "select * from books";
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            while(resultSet.next())
//                    books.add(new Book(
//                            resultSet.getInt(1),
//                            resultSet.getString(2),
//                            resultSet.getFloat(3))
//                    );
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return books;
//    }
//
    @Override
    public Book view(int id) {
        Book book = new Book();
        try{
            book = session.find(Book.class , id);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return book;
    }
//
//    @Override
//    public Book view(String name) {
//        Book book = new Book();
//        try {
//            Statement statement = DBUtil.getConnection().createStatement();
//            String sql =" select * from books  where name like '"+name+"' ";
//
//            ResultSet resultSet = statement.executeQuery(sql);
//
//            while(resultSet.next()){
//                book.setId(resultSet.getInt(1) );
//                book.setName(resultSet.getString(2));
//                book.setPrice(resultSet.getFloat(3));
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        return book;
//    }
}
