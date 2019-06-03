package springframework.recipeapp.controllers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import springframework.recipeapp.models.Recipe;
import springframework.recipeapp.services.RecipeService;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;


public class IndexControllerTest {

    @Mock
    Model model;
    @Mock
    RecipeService recipeService;

    IndexController indexController;
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        indexController = new IndexController(recipeService);
    }
    @Test
    public void getIndexPage() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeSet.add(new Recipe());

        Recipe recipe = new Recipe();
        recipe.setDescription("test");
        recipe.setId(1L);
        recipeSet.add(recipe);
        when(recipeService.getRecipes()).thenReturn(recipeSet);


        ArgumentCaptor<Set<Recipe>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
        //when
        String viewName = indexController.getIndexPage(model);

        //then
        assertEquals("index",viewName);
        verify(recipeService, times(1)).getRecipes();
        //verify the addAttribute "recipes" function was used 1 time
        verify(model, times(1)).addAttribute(eq("recipes"),argumentCaptor.capture());

        Set<Recipe> setIndexController = argumentCaptor.getValue();
        assertEquals(2, setIndexController.size());


    }
}