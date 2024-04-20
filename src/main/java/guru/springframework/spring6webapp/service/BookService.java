package guru.springframework.spring6webapp.service;

import guru.springframework.spring6webapp.domain.Book;
import org.springframework.stereotype.Service;


public interface BookService {

    Iterable<Book> findAll();
}
