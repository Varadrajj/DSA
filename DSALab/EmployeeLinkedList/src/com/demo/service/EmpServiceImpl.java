package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmpLLDao;
import com.demo.dao.EmpLLDaoImpl;

public class EmpServiceImpl implements EmpService{
	EmpLLDao edao;
	public EmpServiceImpl() {
		edao=new EmpLLDaoImpl();
	}

	@Override
	public void addEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id :");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name :");
		String nm=sc.next();
		System.out.println("Enter Salary :");
		double sal=sc.nextDouble();
		Employee e=new Employee(id,nm,sal);
		edao.save(e);
		
	}

	@Override
	public void displayAll() {
		edao.getAll();
		
	}

	@Override
	public Employee deleteById(int id) {
		return edao.deleteId(id);
	}

	@Override
	public Employee searchById(int id) {
		return edao.searchId(id);
	}

}
