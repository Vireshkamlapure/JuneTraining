package bookstore.runner;

import bookstore.dao.BookDAO;
import bookstore.dao.BookDAOImpl;
import bookstore.model.Book;
import java.util.List;
import java.util.Scanner;

public class TestBookStore {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();

        Book book;
        Scanner scanner = new Scanner(System.in);

        int res;
        int choice = 0;
        do {

            System.out.println("1.Add new Book " +
                    "2.Update the Book " +
                    "3.Delete the Book " +
                    "4.View all Books " +
                    "5.Search by ID "+
                    "6.Search by Name "+
                    "0.Exit");
            System.out.println("Which operation you want to perform : ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){

                case 1:
                    System.out.println("Enter Book Name and Price : ");
                    res = bookDAO.insert(new Book(0,scanner.nextLine(),Float.parseFloat(scanner.nextLine())));
                    System.out.println(res+" books inserted.");
                    break;

                case 2:
                    System.out.println("Enter ID of book you want to update and New Name and Price of book.");
                    res = bookDAO.update(new Book(Integer.parseInt(scanner.nextLine()),scanner.nextLine(),Float.parseFloat(scanner.nextLine())));
                    System.out.println(res + " books Updated.");
                    break;

                case 3:
                    System.out.println("Enter ID of book you want to deleted : ");
                    res = bookDAO.delete(new Book(Integer.parseInt(scanner.nextLine()),"",0f));
                    System.out.println(res + " books deletd.");
                    break;

                case 4:
                    System.out.println("Inforamation of all Books : ");
                    List<Book> books ;
                    books = bookDAO.view();
                    for (Book book1 : books){
                        System.out.print("Book ID : " + book1.getId());
                        System.out.print("\t\t\tBook Name : " + book1.getName());
                        System.out.print("\t\t\tBook Price : " + book1.getPrice());
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Enter ID to search info of the book : ");
                    book = bookDAO.view(Integer.parseInt(scanner.nextLine()));
                    System.out.print("Book ID : " + book.getId());
                    System.out.print("\t\t\tBook Name : " + book.getName());
                    System.out.print("\t\t\tBook Price : " + book.getPrice());
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Enter Name to search info of the book : ");
                    book = bookDAO.view(scanner.nextLine());
                    System.out.print("Book ID : " + book.getId());
                    System.out.print("\t\t\tBook Name : " + book.getName());
                    System.out.print("\t\t\tBook Price : " + book.getPrice());
                    System.out.println();
                    break;
            }

        }while(choice != 0);
    }
}
