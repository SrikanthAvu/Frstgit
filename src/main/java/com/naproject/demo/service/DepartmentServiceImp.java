package com.naproject.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naproject.demo.entity.Department;
import com.naproject.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService{
@Autowired
	private DepartmentRepository departmentrepository;
	@Override
	public Department SaveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentrepository.save(department);
	}

}
