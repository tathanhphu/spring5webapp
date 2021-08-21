package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/***
 *
 *  Created by: phuta
 *  Created date: 8/21/21 - 2:55 PM
 *
 */

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
