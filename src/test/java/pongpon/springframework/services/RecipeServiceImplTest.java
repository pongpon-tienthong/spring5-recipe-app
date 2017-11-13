package pongpon.springframework.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pongpon.springframework.domain.Recipe;
import pongpon.springframework.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by pongpon on 11/13/17.
 */
public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() throws Exception {
        Recipe recipe = new Recipe();
        Set<Recipe> recipeSet = new HashSet<>();
        recipeSet.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipeSet);
        assertEquals(1, recipeService.getRecipes().size());
        verify(recipeRepository, times(1)).findAll();
    }

}