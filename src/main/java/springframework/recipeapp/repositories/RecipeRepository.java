package springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipeapp.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
