package com.reven.Service;

import com.reven.model.Cart;
import com.reven.model.Category;

import java.util.List;

public interface CategoryService {

    public Category createCategory(String name, Long userId) throws Exception;

    public List<Category> findCategoryByRestaurantId(Long userId)throws Exception;

    public Category findCategoryById(Long id)throws Exception;

}
