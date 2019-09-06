package com.shailesh.SpringBootDemo.bootstrap;

import com.shailesh.SpringBootDemo.model.Author;
import com.shailesh.SpringBootDemo.model.Book;
import com.shailesh.SpringBootDemo.model.Publisher;
import com.shailesh.SpringBootDemo.repositories.AuthorRepository;
import com.shailesh.SpringBootDemo.repositories.BookRepository;
import com.shailesh.SpringBootDemo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData(){

        //Eric
        Author eric = new Author("Eric" , "Evans");
        Publisher publisher = new Publisher("Harper Collins", "new york");
        Book book1 = new Book("Domain Driven Design","1234", publisher);
        eric.getBooks().add(book1);
        book1.getAuthors().add(eric);

        authorRepository.save(eric);
        publisherRepository.save(publisher);
        bookRepository.save(book1);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Publisher publisher1 = new Publisher("Wrox", "California");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher1 );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        publisherRepository.save(publisher1);
        bookRepository.save(noEJB);
    }
}
