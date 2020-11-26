package pcm.springframework.spring5webappdemo1.repositories;

import org.springframework.data.repository.CrudRepository;
import pcm.springframework.spring5webappdemo1.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
