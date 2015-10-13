package com.certicom.quickly.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.certicom.quickly.bean.Employee;
import com.certicom.quickly.business.EmployeeService;

@ManagedBean
@Controller
@SessionScoped
public class EmployeeManagedBean {
	
	@Autowired
	EmployeeService employeeService;

	private String name;
	
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
