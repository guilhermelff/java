package com.example.apiexemplo.services;

import com.example.apiexemplo.domain.Book;
import com.example.apiexemplo.feign.BookClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookClient bookClient;

    public BookService(BookClient client){
        this.bookClient = client;
    }

    public List<Book> getBooksFromLibrary(){
        return this.bookClient.getBooks();
    }
}
