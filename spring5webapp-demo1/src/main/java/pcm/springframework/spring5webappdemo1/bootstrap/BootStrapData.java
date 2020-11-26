/*
 * Created by PabloCM on 26/11/2020 10:00 pm with IntelliJ IDEA
 * Project spring5webapp-demo1
 */

package pcm.springframework.spring5webappdemo1.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pcm.springframework.spring5webappdemo1.domain.Author;
import pcm.springframework.spring5webappdemo1.domain.Book;
import pcm.springframework.spring5webappdemo1.domain.Publisher;
import pcm.springframework.spring5webappdemo1.repositories.AuthorRepository;
import pcm.springframework.spring5webappdemo1.repositories.BookRepository;
import pcm.springframework.spring5webappdemo1.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        //Telling this to the constructor we have authorRepository and bookRepository "injected" in this bean/component
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher("PCM Publishing", "Fermin Otin Traid, 19", "Zaragoza", "Aragón", 50016);
        publisherRepository.save(publisher);

        Author pc = new Author("Pablo", "Cuesta");
        Book algorithms = new Book("Introduction to algorithms", "456456456");
        pc.getBooks().add(algorithms);
        algorithms.getAuthors().add(pc);
        algorithms.setPublisher(publisher);
        publisher.getBooks().add(algorithms);

        authorRepository.save(pc);
        bookRepository.save(algorithms);

        System.out.println("Nº Publishers: "+ publisherRepository.count());
        System.out.println("Nº Authors: "+ authorRepository.count());
        System.out.println("Number of books: " + bookRepository.count());
    }
}
