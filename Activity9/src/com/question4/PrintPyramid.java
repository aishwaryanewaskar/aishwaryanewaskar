package com.question4;

public class PrintPyramid {

	 public static void printStars(int n)
	    {
	        int i, j;
	 
	        // outer loop to handle number of rows
	        
	        for(i=0; i<n; i++)
	        {
	 
	            //  inner loop to handle number of columns
	              
	            for(j=0; j<=i; j++)
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	 
	            // ending line after each row
	            System.out.println();
	        }
	   }
	     public static void main(String[] args)
	     {
		   {
	          int n = 8;
	          printStars(n);
	       }

	    }

}
