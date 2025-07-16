package com.servlet;

import com.dao.BookDAO;
import com.dao.BookDAOImpl;
import com.model.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {

    BookDAO bookDAO = new BookDAOImpl();
    int res ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String bookname = req.getParameter("bookname");
        String bookprice = req.getParameter("bookprice");
        Float price = Float.parseFloat(bookprice);
        out.println("<h1>Book Name &nbsp&nbsp : &nbsp&nbsp  " +bookname+" Book Price &nbsp&nbsp : &nbsp&nbsp "+bookprice + ".</h1>");

        res = bookDAO.insert( new Book(0,bookname,price));

        out.println("<h1>"+res+" book(s) inserted.</h1>");
    }
}
