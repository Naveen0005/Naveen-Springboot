package com.spring.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.enitity.College;

@Repository
public interface Respository extends JpaRepository<College,Long>{

	
}
