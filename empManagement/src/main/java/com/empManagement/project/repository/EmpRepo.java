package com.empManagement.project.repository;

import com.empManagement.project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}