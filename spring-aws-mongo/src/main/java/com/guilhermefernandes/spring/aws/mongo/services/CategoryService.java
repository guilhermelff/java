package com.guilhermefernandes.spring.aws.mongo.services;

import com.guilhermefernandes.spring.aws.mongo.domain.category.Category;
import com.guilhermefernandes.spring.aws.mongo.domain.category.CategoryDTO;
import com.guilhermefernandes.spring.aws.mongo.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository repository;

    public CategoryService(CategoryRepository repository){
        this.repository = repository;
    }

    public Category insert(CategoryDTO categoryData){
        Category newCategory = new Category(categoryData);
        this.repository.save(newCategory);
        return newCategory;
    }

    public List<Category> getAll(){
        return this.repository.findAll();
    }
}
