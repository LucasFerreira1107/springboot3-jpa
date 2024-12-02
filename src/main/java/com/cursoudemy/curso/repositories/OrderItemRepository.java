package com.cursoudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.curso.entities.OrderItem;
import com.cursoudemy.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
