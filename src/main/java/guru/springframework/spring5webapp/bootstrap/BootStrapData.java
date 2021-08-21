package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/***
 *
 *  Created by: phuta
 *  Created date: 8/21/21 - 2:12 PM
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;
  private final PublisherRepository publisherRepository;

  public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
    this.publisherRepository = publisherRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    System.out.println("BootStrapData started");
    Publisher publisher = new Publisher();
    publisher.setName("Phu Tho");
    publisher.setCity("Sai Gon");
    publisher.setZip("700000");

    publisherRepository.save(publisher);
    System.out.printf("Number of publisher %d\n", publisherRepository.count());
    Author eric = new Author("Eric", "Evan");
    Book ddd = new Book("Domain Driven Design", "12434234");

    eric.getBooks().add(ddd);
    ddd.getAuthors().add(eric);
    ddd.setPublisher(publisher);
    publisher.getBooks().add(ddd);

    authorRepository.save(eric);
    bookRepository.save(ddd);
    publisherRepository.save(publisher);

    Author rod = new Author("Rod", "Johnson");
    Book noEJB = new Book("J2EE Development without EJB", "sadad");
    rod.getBooks().add(noEJB);
    noEJB.getAuthors().add(rod);
    noEJB.setPublisher(publisher);
    publisher.getBooks().add(noEJB);
    authorRepository.save(rod);
    bookRepository.save(noEJB);
    publisherRepository.save(publisher);

    System.out.println("Number of books added " + bookRepository.count());
    System.out.println("Publisher number of books" + publisher.getBooks().size());
  }
}
