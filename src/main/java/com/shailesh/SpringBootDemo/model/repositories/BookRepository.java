package com.shailesh.SpringBootDemo.model.repositories;

import com.shailesh.SpringBootDemo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
