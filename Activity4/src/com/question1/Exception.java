package com.question1;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) throws Exception {
      int a,b,result;
      Scanner s=new Scanner(System.in);
      System.out.println("enter a");
      a=s.nextInt();
      System.out.println("enter b");
      b=s.nextInt();
      if(a==0 && b==0)
      {
    	  throw new Exception("enter two numbers");
      }
      else
      {
    	  try
    	  {
    		  result=a/b;
    		  System.out.println("result is"+result);
    	  }
    	  catch(ArithmaticException e)
    	  {
    		  System.out.println("divide by zero error");
    	  }
      }
	}
	finally
	{
		System.out.println("successful division");
	}
}



