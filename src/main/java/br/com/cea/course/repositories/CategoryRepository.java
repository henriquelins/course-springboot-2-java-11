package br.com.cea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cea.course.entities.Category;

public interface CategoryRepository extends JpaRepository <Category , Long>{
 
}
