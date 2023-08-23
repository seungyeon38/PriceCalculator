package com.dessert39.priceCalculator.dto;

import com.dessert39.priceCalculator.entity.Ingredient;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IngredientRequestDTO {
    private String name;
    private int cate_code;
    private int price;
    private int capacity;
    private String unit;

//    public static IngredientRequestDTO toIngredientDTO(Ingredient ingredient){
//        IngredientRequestDTO ingredientDTO = new IngredientRequestDTO();
//        ingredientDTO.builder()
//                .name(ingredient.getName())
//                .price(ingredient.getPrice())
//                .capacity(ingredient.getCapacity())
//                .unit(ingredient.getUnit());
//
//        return ingredientDTO;
//    }
}
