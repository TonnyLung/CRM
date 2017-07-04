package com.crm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.domain.Employee;
import com.crm.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeInfoController {
	@Autowired
	@Qualifier("employeeDao")
	private final EmployeeService employeeService;

	public EmployeeInfoController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(method=RequestMethod.GET, params="new")
	public String CreateEmployeeProfile(Model model) {
		model.addAttribute(new Employee());
		return "employee/editForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addEmployeeFromForm(@Valid Employee employee, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "employee/editForm";
		}
		employeeService.addEmployee(employee);
		List<Employee> list= employeeService.findMaxId();
		String employeeNumber = null;
		for(Employee e : list) {
			employeeNumber = e.getEmployeeNumber();
		}
		return "redirect:/employee/" + employeeNumber;
	}
	
	@RequestMapping(value="/{employeeNumber}", method=RequestMethod.GET)
	public String showEmployee(@PathVariable String employeeNumber, Model model) {
		List<Employee> list = employeeService.findEmployeeByEmployeeNumber(employeeNumber);
		for(Employee e : list) {
			model.addAttribute("employee", e);
		}
		return "employee/view";
	}
}
