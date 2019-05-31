package springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipeapp.models.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
