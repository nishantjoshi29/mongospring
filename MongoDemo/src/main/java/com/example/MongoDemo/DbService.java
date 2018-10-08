package com.example.MongoDemo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DbService extends MongoRepository<Employee, Long>{
   public List<Employee> findByName(String name);
   public Employee findByAge(Long age);
   public Employee findByNameAndAge(String name,Long age);
   public List<Employee> findByNameAndSalary(String name,int salary);
}
