package br.com.cea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cea.course.entities.Order;

public interface OrderRepository extends JpaRepository <Order , Long>{
 
}
