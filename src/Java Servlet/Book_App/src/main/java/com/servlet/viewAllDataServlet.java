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
import java.util.List;

@WebServlet("/viewAllDataServlet")
public class viewAllDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        BookDAO bookDAO = new BookDAOImpl();
        List<Book> books = bookDAO.view();

        
        out.println("<style>" +
                "table { border-collapse: collapse; width: 60%; margin: 20px auto; font-family: Arial; }" +
                "th, td { border: 1px solid #ccc; padding: 10px; text-align: center; }" +
                "th { background-color: #f2f2f2; }" +
                "</style>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th> ID    </th>");
        out.println("<th> Name  </th>");
        out.println("<th> Price </th>");
        out.println("</tr>");
        for (Book book : books){
            out.println("<tr>");
            out.println("<td>" + book.getId() + "</td>");
            out.println("<td>" + book.getName() + "</td>");
            out.println("<td>" + book.getPrice() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
    }
}
