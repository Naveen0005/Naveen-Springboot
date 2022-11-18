package com.spring.demo.servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.enitity.College;
import com.spring.demo.respository.Respository;

@Service
public class Serviesimple implements Servies01{

	@Autowired
	private Respository resp;

	@Override
	public College insertdata(College clg) {
		/*insert into college(user_address, user_name, userid) values (?, ?, ?)*/
		return resp.save(clg);
	}

	@Override
	public List<College> getAlldata() {
		//select * from student
	return resp.findAll();
	}

	@Override
	public void delete(Long id) {
		/*delete from table name;*/
		 resp.deleteById(id);
		
	}
	
}
