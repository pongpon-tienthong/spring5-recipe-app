package pongpon.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import pongpon.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
