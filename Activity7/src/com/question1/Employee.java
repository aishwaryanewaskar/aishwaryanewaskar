package com.question1;

public class Employee
{

	int id;    
	//taking values
	String name;
	int age;
	int salary;
	
	//creating constructor
	public Employee(int id, String name, int age, int salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public int compareTo(Employee s) 
	
	{
		if(salary==s.salary)      //comparing employees with salary
			return 0;				 	
		else 
		if(salary>s.salary) 
			return 1;
		else 
			return -1;
		
	}
}
