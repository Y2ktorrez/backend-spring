package com.y2k.ecommerce.service.interf;


import com.y2k.ecommerce.dto.CategoryDto;
import com.y2k.ecommerce.dto.Response;


public interface CategoryService {
    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
