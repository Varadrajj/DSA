package com.demo.service;

import com.demo.beans.Employee;

public interface EmpService {

	void addEmployee();

	void displayAll();

	Employee deleteById(int id);

	Employee searchById(int id);

}
