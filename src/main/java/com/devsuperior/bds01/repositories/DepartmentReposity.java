package com.devsuperior.bds01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.bds01.entities.Department;

public interface DepartmentReposity extends JpaRepository<Department, Long> {

}
