package org.dxctraining.author.dao;

import org.dxctraining.author.entities.Author;
import org.dxctraining.author.exceptions.AuthorNotFoundException;
import org.dxctraining.author.exceptions.InvalidArgumentException;

import java.util.HashMap;
import java.util.Map;

public class AuthorDaoImp implements IAuthorDao {
private Map<String,Author> authorMap=new HashMap<>();

    @Override
    public Author findAuthorID(String id) {
       Author author=authorMap.get(id);
       if(author==null)
       {
           throw  new AuthorNotFoundException("Author not found");
       }
       return author;
    }

    @Override
    public void addAuthor(Author author) {
     String id=author.getId();
     authorMap.put(id,author);
    }

    @Override
    public Author updateName(Author author, String name){
        if(name==null)
        {
            throw new InvalidArgumentException("name can't be null");
        }
        else
            author.setName(name);
        return author;
    }

    @Override
    public void removeAuthor(String id) {
     authorMap.remove(id);
    }
}
