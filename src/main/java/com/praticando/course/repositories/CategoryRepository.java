package com.praticando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticando.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
