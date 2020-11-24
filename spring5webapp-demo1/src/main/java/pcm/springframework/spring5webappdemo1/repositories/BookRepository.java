package pcm.springframework.spring5webappdemo1.repositories;

import org.springframework.data.repository.CrudRepository;
import pcm.springframework.spring5webappdemo1.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
