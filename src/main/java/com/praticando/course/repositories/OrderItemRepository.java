package com.praticando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praticando.course.entities.OrderItem;
import com.praticando.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
