package com.dessert39.priceCalculator.repository;

import com.dessert39.priceCalculator.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 첫번째 인자 : Entity 종류, 두번째 인자 : pk type
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
