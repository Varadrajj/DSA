package com.demo.dao;

import com.demo.beans.Employee;

public interface EmpLLDao {

	void save(Employee e);

	void getAll();

	Employee deleteId(int id);

	Employee searchId(int id);

}
