package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.ApiService;

@RestController
public class ApiController {

	
	@Autowired
	ApiService aser;
	
	@PostMapping("/")
	public boolean add(@RequestBody Employee ee)
	{
	    boolean success= aser.saveinfo(ee)!=null;
	    return success;
	}
	@GetMapping("/")
	public List<Employee> show()
	{
		return aser.showinfo();
	}
	@GetMapping("/{id}")
	public Optional<Employee> oneEmployee(@PathVariable int id) {
		return aser.getEmployeeById(id);
	}
	@GetMapping("getid")
	public Optional<Employee> oneEmp(@RequestParam int id) {
		return aser.getEmpid(id);
	}
	

}
