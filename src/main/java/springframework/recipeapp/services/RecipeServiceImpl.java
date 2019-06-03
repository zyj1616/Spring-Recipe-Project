package springframework.recipeapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import springframework.recipeapp.models.Recipe;
import springframework.recipeapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;
@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    @Override
    public Set<Recipe> getRecipes(){

        Set<Recipe> recipes = new HashSet<>();
        log.debug("test",recipes);
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
