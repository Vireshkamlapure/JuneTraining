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

@WebServlet("/doBook")
public class ControllerServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        BookDAO bookDAO = new BookDAOImpl();
        int res = -1;
        String msg = "";
        String operation = req.getParameter("operation");
        List<Book> books;
        switch (operation){

            case "Add":
                res = bookDAO.insert(new Book(0, req.getParameter("bookname"), Float.parseFloat(req.getParameter("bookprice"))));
                msg = res+" rows inserted. ";
                req.setAttribute("msg",msg);
                req.getRequestDispatcher("result.jsp").forward(req,resp);
                break;
            case "Delete":
                res = bookDAO.delete(new Book(Integer.parseInt(req.getParameter("bookid")),"",0f));
                msg = res+" rows deleted. ";
                req.setAttribute("msg",msg);
                req.getRequestDispatcher("result.jsp").forward(req,resp);
                break;
            case "Update":
                res = bookDAO.update(new Book(Integer.parseInt(req.getParameter("bookid")),req.getParameter("bookname"), Float.parseFloat(req.getParameter("bookprice"))));
                msg = res+" rows update. ";
                req.setAttribute("msg",msg);
                req.getRequestDispatcher("result.jsp").forward(req,resp);
                break;
            case "View":
                books = bookDAO.view();
                req.setAttribute("books", books);
                req.getRequestDispatcher("view.jsp").forward(req, resp);
                break;
            case "ViewId":
                books = bookDAO.view(Integer.parseInt(req.getParameter("bookid")));
                req.setAttribute("books", books);
                req.getRequestDispatcher("view.jsp").forward(req, resp);
                break;
            case "ViewName":
                books = bookDAO.view(req.getParameter("bookname"));
                req.setAttribute("books", books);
                req.getRequestDispatcher("view.jsp").forward(req, resp);
                break;
        }

    }
}
