package springframework.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.recipeapp.models.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
