package com.reven.Service;

import com.reven.model.IngredientCategory;
import com.reven.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {

    public IngredientCategory createIngredientCategory(String name, Long restaurantId)throws Exception;

    public IngredientCategory findIngredientCategoryById(Long id)throws Exception;

    public List<IngredientCategory> findAllIngredientCategoryByRestaurantId(Long id)throws Exception;

    public IngredientsItem createIngredientsItem(Long restaurantId, String ingredientName, Long categoryId)throws Exception;

    public List<IngredientsItem> findRestaurantIngredients(Long restaurantId)throws Exception;

    public IngredientsItem updateStock(Long id)throws Exception;
}
