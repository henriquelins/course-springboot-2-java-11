package br.com.cea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cea.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem , Long>{
 
}
