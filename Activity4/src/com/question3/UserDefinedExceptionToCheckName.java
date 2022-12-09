package com.question3;
import java.util.Scanner;
import javax.naming.InvalidNameException;
public class UserDefinedExceptionToCheckName
{
		void validateName(String name) throws InvalidNameException
		{
			
		String[] names = { "Aishwarya", "Prerak", "Rutuja", "Janvi","Sonali","Shruti"};
	        boolean show= false;
	        for (String n: names)
	        {
	            if (n.equalsIgnoreCase(name))
	            {
	                show = true;
	                break;
	            }
	        }
	        if (show)
	        {
	            System.out.println("Valid Name");
	        } 
	        else 
	        {
	            throw new InvalidNameException(" Enter Invalid name");
	        }
	    }
		public static void main(String[] args)
		{
			 
		        UserDefinedExceptionToCheckName ck=new UserDefinedExceptionToCheckName();
		        Scanner sc=new Scanner(System.in);
		        			
		        System.out.println("Enter Name:");
		        String name = sc.next();
		        try
		        {
		            ck.validateName(name);
		        }
		        catch(InvalidNameException e) 
		        {
		        	
		            System.out.println("Invalid Name " +e);
		        }
		}
	}
