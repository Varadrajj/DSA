package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		EmpService eservice=new EmpServiceImpl();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Add Employee\n2.Delete By Id\n3.Search By Id\n4.Display All\n5.Exit");
			System.out.println("Enter choice :");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				eservice.addEmployee();
				break;
			case 2:
				System.out.println("Enter Id For Deletion :");
				int id=sc.nextInt();
				Employee e=eservice.deleteById(id);
				if(e!=null) {
					System.out.println("Id Deleted Successfully");
				}else {
					System.out.println("Id Not Found!!!");
				}
				break;
			case 3:
				System.out.println("Enter Id To Search :");
				id=sc.nextInt();
				e=eservice.searchById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("Id Not found !!!");
				}
				break;
			case 4:
				eservice.displayAll();
				break;
			case 5:
				sc.close();
				System.out.println("Thank You!!!");
			default :
					System.out.println("Wrong Choice!!!");
			}
		}while(ch!=5);

	}

}
