package springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipeapp.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
