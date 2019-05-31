package springframework.recipeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springframework.recipeapp.services.RecipeService;
import springframework.recipeapp.services.RecipeServiceImpl;

@Controller
public class IndexController {

    @Autowired
    private RecipeService recipeService;


    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return  "index";
    }
}
