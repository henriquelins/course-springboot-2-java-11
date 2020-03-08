package br.com.cea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cea.course.entities.User;

public interface UserRepository extends JpaRepository <User , Long>{
 
}
