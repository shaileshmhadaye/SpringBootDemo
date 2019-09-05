package com.shailesh.SpringBootDemo.model.repositories;

import com.shailesh.SpringBootDemo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
