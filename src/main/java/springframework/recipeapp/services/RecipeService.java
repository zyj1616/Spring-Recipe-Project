package springframework.recipeapp.services;

import org.springframework.stereotype.Service;
import springframework.recipeapp.models.Recipe;
import java.util.Set;
@Service
public interface RecipeService {

    Set<Recipe> getRecipes();
}
