package com.estudo.inventory.services;

import com.estudo.inventory.dto.CategoryDTO;
import com.estudo.inventory.entities.Category;
import com.estudo.inventory.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BaseService<Category, CategoryDTO, Long> {

    public CategoryService(CategoryRepository repository) {
        super(repository);
    }
}
