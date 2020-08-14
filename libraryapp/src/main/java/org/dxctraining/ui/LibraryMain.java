package org.dxctraining.ui;

import org.dxctraining.author.entities.Author;
import org.dxctraining.author.services.AuthorServiceImplem;
import org.dxctraining.author.services.IAuthorService;
import org.dxctraining.book.entities.Book;
import org.dxctraining.book.services.BookServiceImplem;
import org.dxctraining.book.services.IbookService;

import java.util.List;

public class LibraryMain {
    private IbookService bookservice=new BookServiceImplem();
    private IAuthorService authorService=new AuthorServiceImplem();
    public static void main(String args[])
    {
        LibraryMain libapp=new LibraryMain();
        libapp.run();
    }
    private void run() {
        Author author1 = new Author("1", "vineel");
        Author author2 = new Author("2", "rudrapati");
        Author author3 = new Author("3", "Mathew");
        authorService.addAuthor(author1);
        authorService.addAuthor(author2);
        authorService.addAuthor(author3);
        Book book1 = new Book("animalfarm", 234, author1);
        Book book2 = new Book("gullivers travels", 432, author2);
        Book book3 = new Book("panchathantra", 24,author3);
        bookservice.addBook(book1);
        bookservice.addBook(book2);
        bookservice.addBook(book3);
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
        System.out.println("displaying the books details");
        Author author=book.getAuthor();
        System.out.println("The author is "+author.getName()+" Name of the book "+book.getName()+
                " The price "+book.getCost());
    }


}
