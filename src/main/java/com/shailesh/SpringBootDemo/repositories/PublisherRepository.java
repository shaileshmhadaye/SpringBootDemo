package com.shailesh.SpringBootDemo.repositories;

import com.shailesh.SpringBootDemo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
