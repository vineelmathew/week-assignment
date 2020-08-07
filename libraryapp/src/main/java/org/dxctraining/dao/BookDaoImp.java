package org.dxctraining.dao;

import org.dxctraining.entities.Book;
import org.dxctraining.exceptions.BookNotFoundException;

import java.util.*;

public class BookDaoImp implements IbookDao {
    private Map<String, Book> store = new HashMap<>();
    private int id;
    public String genId()
    {
        id++;
        String strid=""+id;
        return strid;
    }
    @Override
    public Book findBookId(String id) {
        Book book=store.get(id);
        if(book==null)
        {
            throw new BookNotFoundException("Book not found or id is wrong");
        }
        return book;
    }

    @Override
    public Book updateBookcost(String id, double cost) {
       Book book=findBookId(id);
       book.setCost(cost);
       return book;
    }

    @Override
    public void addBook(Book book) {
        String id=book.getId();
        store.put(id,book);
        book.setId(id);
    }

    @Override
    public void removeBook(String id) {
        store.remove(id);
    }
    @Override
    public List<Book> showBooks() {
     Collection<Book> collection=store.values();
     List<Book>list=new ArrayList<>();
     for(Book books:collection)
     {
         list.add(books);
     }
     return list;
    }
}
