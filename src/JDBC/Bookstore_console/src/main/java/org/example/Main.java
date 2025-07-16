package org.example;

import java.sql.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String bookName ;
        Float bookPrice;

        Scanner scanner = new Scanner(System.in);


        Class.forName("org.h2.Driver");
        System.out.println("Driver Loaded");

        Connection conn = DriverManager.
                getConnection("jdbc:h2:/Users/vireshkamlapure/Desktop/h2","sa","");
        System.out.println("Connection Established.");

        Statement statement = conn.createStatement();

        // TODO : Insert a new book
        System.out.println("Enter book Name and Book Price");
        bookName = scanner.nextLine();
        bookPrice = Float.parseFloat(scanner.nextLine());
        String query = "insert into books(name,price) values(' " + bookName+" ' , "+bookPrice+ ")";
        int affectRowCount = statement.executeUpdate(query);
        System.out.println(affectRowCount+" rows inserted.");

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
        statement = conn.createStatement();
        String sql = "select * from books";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println("====Printing book row====");
            System.out.println("Id : "+resultSet.getString(1)+" Name : "+resultSet.getString(2)+" Price : "+resultSet.getFloat(3));
        }

        conn.close();

    }
}