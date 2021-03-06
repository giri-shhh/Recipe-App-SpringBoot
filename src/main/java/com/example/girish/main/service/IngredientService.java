package com.example.girish.main.service;

import com.example.girish.main.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    boolean deleteById(Long recipeId, Long idToDelete);
}
