//Author:Aishwarya
//Code to display Pattern
package com.question3;

public class Pattern {

	public static void main(String[] args)
  {
		int rows = 5, number = 1;

	    for(int i = 1; i <= rows; i++) 
	    {

	      for(int j = 1; j <= i; j++) 
	      {
	        System.out.print(number + " ");
	        ++number;
	      }

	      System.out.println();
	    }
	  }

	}


