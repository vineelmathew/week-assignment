package org.dxctraining.author.dao;


import org.dxctraining.author.entities.Author;
import org.dxctraining.book.entities.Book;

import java.util.List;

public interface IAuthorDao {
Author findAuthorID(String id);
public void addAuthor(Author author);
Author updateName(Author author,String name);
public void removeAuthor(String id);


}
