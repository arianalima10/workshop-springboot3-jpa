package com.praticando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticando.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}