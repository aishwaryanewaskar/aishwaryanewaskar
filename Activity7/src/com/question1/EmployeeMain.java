package com.question1;

import java.util.ArrayList;
import java.util.Collections;


public class EmployeeMain {

	public static void main(String[] args) 
	{
		   Employee e1=new Employee(1,"aishwarya",20,20000);       //taking values for employee1
		   Employee e2=new Employee(2,"prerak",22,240000);         //taking values for employee2
		   Employee e3=new Employee(3,"rutuja",19,190000);         //taking values for employee3
		   Employee e4=new Employee(4,"sonali",18,10000);          //taking values for employee4
		   
		   ArrayList<Employee> al=new ArrayList<Employee>();
	        al.add(e1);
	        al.add(e2);
	        al.add(e3);
	        al.add(e4);
	        
	        Collections.sort(al);	//sorting arrayList by  salary	
			for(Employee s:al)
			{
				System.out.println(s.id+" "+s.name+" "+s.age+" "+s.salary);
			}
	    	
	}
     

     
}
