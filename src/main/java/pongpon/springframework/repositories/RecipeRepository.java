package pongpon.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import pongpon.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
