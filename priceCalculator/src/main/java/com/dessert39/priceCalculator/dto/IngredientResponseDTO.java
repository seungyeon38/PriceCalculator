package com.dessert39.priceCalculator.dto;

import com.dessert39.priceCalculator.entity.Ingredient;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IngredientResponseDTO {
    private int id;
    private String name;
    private int cate_code;
//    private String cate_name;
    private int price;
    private int capacity;
    private String unit;
    private double unit_price;

//    public static IngredientResponseDTO toIngredientDTO(Ingredient ingredient){
//        IngredientResponseDTO ingredientDTO = new IngredientResponseDTO();
//        ingredientDTO.builder()
//                .id(ingredient.getId())
//                .name(ingredient.getName())
//                .cate_code(ingredient.getCate_code())
//                .price(ingredient.getPrice())
//                .capacity(ingredient.getCapacity())
//                .unit(ingredient.getUnit())
//                .unit_price(ingredient.getUnit_price());
//
//        return ingredientDTO;
//    }
}
