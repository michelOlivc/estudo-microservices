package com.estudo.inventory.repositories;

import com.estudo.inventory.entities.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends BaseRepository<Category, Long> {
}
