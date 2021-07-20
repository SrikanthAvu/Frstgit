package com.naproject.demo.controller123.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.naproject.demo.entity.Department;
import com.naproject.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentservice;
	
	@PostMapping("/departments")
	public Department SaveDepartment(@RequestBody Department department)
	{
		return departmentservice.SaveDepartment(department));
		
	}

}
