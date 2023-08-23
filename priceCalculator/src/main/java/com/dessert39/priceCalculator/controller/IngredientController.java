package com.dessert39.priceCalculator.controller;

import com.dessert39.priceCalculator.dto.IngredientRequestDTO;
import com.dessert39.priceCalculator.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor // NotNull or final이 붙은 변수들에 대해 생성자를 만들어줌.
@RequestMapping("/api/ingredient")
public class IngredientController {
    private final IngredientService ingredientService; // 생성자 주입

    @PostMapping
    public void postIngredient(@RequestBody IngredientRequestDTO ingredientRequestDTO){
        System.out.println("IngredientRequestDTO: " + ingredientRequestDTO);
        ingredientService.save(ingredientRequestDTO);
    }

}
