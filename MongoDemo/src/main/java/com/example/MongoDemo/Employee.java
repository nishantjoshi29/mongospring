package com.example.MongoDemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Mongo")
public class Employee {
    
	@Id
	private  Long age;
private int salary;
private String name;
public Long getAge() {
	return age;
}
public void setAge(Long age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
