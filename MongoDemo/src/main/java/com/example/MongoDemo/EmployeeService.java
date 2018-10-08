package com.example.MongoDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {
	
	@Autowired
	DbService service;
    @PostMapping("/insert")
	public String insert(@RequestBody Employee e)
	{   service.save(e);
    	return "Inserted";
	}
    @GetMapping("/select/{id}")
    public Employee getEmployee(@PathVariable("id")Long id)
    {
    	return service.findById(id).get();
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id")Long id)
    {
    	service.deleteById(id);
    	return "deleted";
    }
    @GetMapping("/selectName/{name}")
    public List<Employee> getEmployeeByName(@PathVariable("name") String name)
    {
    	return (List<Employee>) service.findByName(name);
    }
    @GetMapping("/selectAge/{age}")
    public Employee getEmployeeByAge(@PathVariable("age")Long age)
    {
    	return service.findByAge(age);
    }
    @GetMapping("/selectnameage/{name}/{age}")
    public Employee getEmployeeNameAge(@PathVariable("name")String name,@PathVariable("age")Long age)
    {
    	return service.findByNameAndAge(name, age);
    }
    @GetMapping("/selectnameslary/{name}/{salary}")
    public List<Employee> getEmployeeNameSalary(@PathVariable("name")String name,@PathVariable("salary")int salary)
    {
    	return service.findByNameAndSalary(name, salary);
    }
}

