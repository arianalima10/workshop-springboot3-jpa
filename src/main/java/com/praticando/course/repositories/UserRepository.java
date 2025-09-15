package com.praticando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticando.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
