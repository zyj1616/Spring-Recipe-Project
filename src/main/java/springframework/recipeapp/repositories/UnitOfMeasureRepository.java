package springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipeapp.models.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
