package com.dessert39.priceCalculator.service;

import com.dessert39.priceCalculator.dto.IngredientRequestDTO;
import com.dessert39.priceCalculator.entity.Ingredient;
import com.dessert39.priceCalculator.repository.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IngredientService {
    private final IngredientRepository ingredientRepository;

    public void save(IngredientRequestDTO ingredientRequestDTO){
        Ingredient ingredient = Ingredient.toIngredient(ingredientRequestDTO);
        ingredientRepository.save(ingredient);
    }
}
