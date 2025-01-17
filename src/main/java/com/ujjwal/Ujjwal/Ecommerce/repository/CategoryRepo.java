package com.ujjwal.Ujjwal.Ecommerce.repository;

import com.ujjwal.Ujjwal.Ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
