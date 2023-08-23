package com.dessert39.priceCalculator.entity;

import com.dessert39.priceCalculator.dto.IngredientRequestDTO;
import com.dessert39.priceCalculator.dto.IngredientResponseDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 데이터베이스(MySQL)에 위임
    @Column(name = "ingredient_id")
    private int id;
    @Column(name = "ingredient_name")
    private String name;
    @Column(name = "category_code")
    private int cate_code;

    private int price;
    private int capacity;
    private String unit;
    private double unit_price;

    public static Ingredient toIngredient(IngredientRequestDTO ingredientDTO){
        Ingredient ingredient = new Ingredient();

        ingredient.builder()
                .name(ingredientDTO.getName())
                .cate_code(ingredientDTO.getCate_code())
                .price(ingredientDTO.getPrice())
                .capacity(ingredientDTO.getCapacity())
                .unit(ingredientDTO.getUnit())
                .unit_price((double)ingredientDTO.getPrice()/ingredientDTO.getCapacity());

        return ingredient;
    }

}
