package com.flp.ems.view;

import java.util.List;
import java.util.Scanner;

import com.flp.ems.domain.Employee;

	public class BootClass {
	
		
		static UserInteraction ui=new UserInteraction();	
		static Scanner sc=new Scanner(System.in);
		public static void main(String args[])
		{   
			int ch;
			while(true)
			{
				System.out.println("Menu");
				System.out.println("Enter ur choice 1.Add 2.Modify 3.Remove 4.Search 5.GetAllEmp");
				ch=sc.nextInt();
				menuSelection(ch);
			}
	}
		
	public static void menuSelection(int ch){
		Employee emp;
		List<Employee> emps;
		switch(ch)
		{
			case 1:emp=ui.AddEmployee();
					if(emp != null)
						System.out.println("Employee added is "+emp);
					else
						System.out.println("Failed to add the Employee");
					break;
			case 2:ui.ModifyEmployee();
					break;
			case 3:System.out.println("Employee removal  status is "+ui.RemoveEmployee());
              		break;
			case 4:emp=ui.SearchEmployee();
					if(emp != null)
						System.out.println("Employee Found "+emp);
					else
						System.out.println("Employee Not Found");
					break;
			case 5:emps=ui.getAllEmployee();
					if(emps != null)
						System.out.println("All Employees details are "+emps);
					else
						System.out.println("No Employees Found");
					break;
			case 6:System.exit(0);       
		}
	}
}
