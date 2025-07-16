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

@WebServlet("/DeleteBookServlet")
public class DeleteBookServlet extends HttpServlet {

    BookDAO bookDAO = new BookDAOImpl();
    int res ;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String bookid = req.getParameter("bookid");
        Integer id = Integer.parseInt(bookid);
        out.println("<h1>Deleting Book &nbsp&nbsp : &nbsp&nbsp  " +id+".</h1>");

        res = bookDAO.delete( new Book(id,"",0f));

        out.println("<h1>"+res+" book(s) deleted.</h1>");
    }
}
