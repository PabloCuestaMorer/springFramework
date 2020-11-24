package pcm.springframework.spring5webappdemo1.repositories;

import org.springframework.data.repository.CrudRepository;
import pcm.springframework.spring5webappdemo1.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
