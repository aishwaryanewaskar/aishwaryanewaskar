package com.question1;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) 
{
		// declare and initialize here
					int p,q,r;
					Scanner sc=new Scanner(System.in);
					//  asks the user to input two numbers
					System.out.println("Enter 1st number : ");
					p=sc.nextInt();
					System.out.println("Enter 2nd number : ");
					q=sc.nextInt();			
				try
				{
					//first number is then divided by the second number and display the result on screen
					r=p/q;
					System.out.println("Result:"+r);
				}
				catch(ArithmeticException e)
				{
					//Arithmetic Exception is thrown when user try to divide by zero
					System.out.println("Arithmetic Exception occured");
				}
			}
		
}


