package com.briz.springboot_hibernate_test1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*
;@Repository

public interface EmployeeRepository extends JpaRepository<Employee,Integer> 
{
List<Employee> findByName(String name);
}
