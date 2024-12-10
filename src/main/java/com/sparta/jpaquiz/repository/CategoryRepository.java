package com.sparta.jpaquiz.repository;

import com.sparta.jpaquiz.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
