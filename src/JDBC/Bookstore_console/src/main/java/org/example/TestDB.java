package org.example;

import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.h2.Driver");
        System.out.println("Driver Loaded");

        Connection conn = DriverManager.
                getConnection("jdbc:h2:/Users/vireshkamlapure/Desktop/h2","sa","");
        System.out.println("Connection Established.");

        // TODO : Insert a new book

//        Statement statement = conn.createStatement();
//        String query = "insert into books(name,price) values('OCPJP by kathy' , 4200)";
//        int affectRowCount = statement.executeUpdate(query);
//        System.out.println(affectRowCount+" rows inserted.");

        //TODO : Update a book
//        Statement statement = conn.createStatement();
//        String query = "update books set name= 'OCPJP by Kathy Siarra ' , price = 4800 ";
//        int affectRowCount = statement.executeUpdate(query);
//        System.out.println(affectRowCount+" rows updated.");

        //TODO :Delete a book
//        Statement statement = conn.createStatement();
//        String query = "delete from books where id=1 ";
//        int affectRowCount = statement.executeUpdate(query);
//        System.out.println(affectRowCount+" rows deleted.");

        //TODO : View all books
//        Statement statement = conn.createStatement();
//        String sql = "select * from books";
//        ResultSet resultSet = statement.executeQuery(sql);
//
//        while (resultSet.next()){
//            System.out.println("====Printing book row====");
//            System.out.println("Id : "+resultSet.getString(1)+" Name : "+resultSet.getString(2)+" Price : "+resultSet.getFloat(3));
//        }

        conn.close();
    }
}
