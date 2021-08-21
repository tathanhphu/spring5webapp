package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/***
 *
 *  Created by: phuta
 *  Created date: 8/21/21 - 2:08 PM
 *
 */

public interface BookRepository extends CrudRepository<Book, Long> {
}
