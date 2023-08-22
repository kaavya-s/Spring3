package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class ApiService {
	@Autowired
	EmployeeRepo er;
	public Employee saveinfo(Employee ee)
	{
		return er.save(ee);
	}
	
	public List<Employee> showinfo(){
		return er.findAll();
	}

	public Optional<Employee> getEmployeeById(@PathVariable(name="id")int id) {
		return er.findById(id);
	}

}
