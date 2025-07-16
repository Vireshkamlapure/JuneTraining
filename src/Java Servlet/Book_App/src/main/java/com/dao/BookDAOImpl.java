package com.dao;


import com.model.Book;
import com.util.DBUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    @Override
    public int insert(Book book) {

        try {
            String sql = "insert into books(name,price) values(? , ?)";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, book.getName());
            preparedStatement.setFloat(2, book.getPrice());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int update(Book book) {

        try {
            String sql = "update books set name= ? , price = ? where id = ? ";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setString(1, book.getName());
            preparedStatement.setFloat(2, book.getPrice());
            preparedStatement.setFloat(3, book.getId());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int delete(Book book) {

        try {
            String sql = "delete from books where id = ?";
            PreparedStatement preparedStatement = DBUtil.getConnection().prepareStatement(sql);
            preparedStatement.setInt(1,book.getId());
            int res = 0;
            res = preparedStatement.executeUpdate();
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public List<Book> view() {

        List<Book> books = new ArrayList<>();

        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "select * from books";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
                books.add(new Book(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getFloat(3))
                );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    @Override
    public Book view(int id) {
        Book book = new Book();
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql = "select * from books  where id = "+id;

            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                book.setId(resultSet.getInt(1));
                book.setName(resultSet.getString(2));
                book.setPrice(resultSet.getFloat(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return book;
    }

    @Override
    public Book view(String name) {
        Book book = new Book();
        try {
            Statement statement = DBUtil.getConnection().createStatement();
            String sql =" select * from books  where name like '"+name+"' ";

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                book.setId(resultSet.getInt(1) );
                book.setName(resultSet.getString(2));
                book.setPrice(resultSet.getFloat(3));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return book;
    }
}

