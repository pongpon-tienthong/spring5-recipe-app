package pongpon.springframework.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pongpon.springframework.domain.Recipe;
import pongpon.springframework.services.RecipeService;

import java.util.Set;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;



    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        Set<Recipe> recipeSet = recipeService.getRecipes();
        model.addAttribute("recipes", recipeSet);
        return "index";
    }
}
