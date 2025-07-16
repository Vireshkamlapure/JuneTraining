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

@WebServlet("/UpdateBookServlet")
public class UpdateBookServlet extends HttpServlet {

    BookDAO bookDAO = new BookDAOImpl();
    int res ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String bookid = req.getParameter("bookid");
        String bookname = req.getParameter("bookname");
        String bookprice = req.getParameter("bookprice");
        Integer id = Integer.parseInt(bookid);
        Float price = Float.parseFloat(bookprice);

        res = bookDAO.update( new Book(id,bookname,price));

        out.println("<h1>"+res+" book(s) Updated.</h1>");
    }
}
