package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/***
 *
 *  Created by: phuta
 *  Created date: 8/21/21 - 2:06 PM
 *
 */

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
