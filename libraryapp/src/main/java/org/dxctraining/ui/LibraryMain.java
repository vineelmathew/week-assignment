package org.dxctraining.ui;

import org.dxctraining.entities.Author;
import org.dxctraining.entities.Book;
import org.dxctraining.services.BookServiceImplem;
import org.dxctraining.services.IbookService;

import java.util.List;

public class LibraryMain {
    private IbookService bookservice=new BookServiceImplem();
    public static void main(String args[])
    {
        LibraryMain libapp=new LibraryMain();
        libapp.run();
    }

    private void run() {
        Author author1 = new Author("1", "vineel");
        Author author2 = new Author("2", "rudrapati");
        Author author3 = new Author("3", "Mathew");
        Author author4 = new Author("4", "vijay");
        Book book1 = new Book("animalfarm", 234, 64.42, author1);
        Book book2 = new Book("gullivers travels", 432, 100, author2);
        Book book3 = new Book("panchathantra", 24, 64.42, author3);
        Book book4 = new Book("volume", 42, 188, author4);
        bookservice.addBook(book1);
        bookservice.addBook(book2);
        bookservice.addBook(book3);
        bookservice.addBook(book4);
        Showbooks();
    }

    private void Showbooks() {
        List<Book> list=bookservice.showBooks();
        for(Book book:list)
        {
            display(book);
        }

    }

    private void display(Book book) {
        System.out.println("display the books details");
        Author author=book.getAuthor();
        System.out.println("The author is "+author.getName()+" Name of the book "+book.getName()+
                " The price "+book.getCost());
    }


}
