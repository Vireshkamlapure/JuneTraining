<%@ page import = "java.util.List" %>
<%@ page import = "com.dao.BookDAO" %>
<%@ page import = "com.dao.BookDAOImpl" %>
<%@ page import = "com.model.Book" %>
<html>
<body>
    <h1>View All books</h1>

    <table border>
        <tr>
            <th>ID<th>
            <th>Name<th>
            <th>Price<th>
        </tr>

        <%
            List<Book> books = (List<Book>)request.getAttribute("books");
            for (Book book : books){
        %>
        <tr>
            <td> <%= book.getId() %> <td>
            <td> <%= book.getName() %> <td>
            <td> <%= book.getPrice() %> <td>
        </tr>

        <%
            }
        %>
</table>

</body>
</html>