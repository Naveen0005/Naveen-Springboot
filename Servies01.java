package com.spring.demo.servies;

import java.util.List;

import com.spring.demo.enitity.College;

public interface Servies01 {

	public College insertdata(College clg);
	

	public List<College> getAlldata();
	
	public void delete(Long id);
			

}
