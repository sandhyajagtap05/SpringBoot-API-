	package com.example.crud.demo.controller;
	
	import java.util.List;
	import java.util.Optional;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.example.crud.demo.entity.Employee;
	import com.example.crud.demo.service.MyService;
	import com.example.crud.demo.service.MyServiceImpl;
	
	@RestController
	public class MyController {
		
		@Autowired 
		MyService myService;
		
		@GetMapping("getAll")
		
		public List<Employee> getAll(){
			
			 return myService.getAll();
		}
		
		
		@PostMapping("AddData")
		
		public Employee AddData(@RequestBody Employee employee){
			
			return myService.AddData(employee);
			
		}
		
		@PutMapping("update")
		
		public Employee update(@RequestBody Employee employee) {
			
			return myService.update(employee);
			
		}
		
		@GetMapping("get/{id}")
		
		public Optional<Employee> getOne(@PathVariable Long id) {
			
			return myService.getOne(id);
		}
		
		@DeleteMapping("delete/{id}")
		
		public String deleteOne(@PathVariable Long id){
			
			 myService.deleteOne(id);
			 
			 return "deleted";
		}
	
	}
