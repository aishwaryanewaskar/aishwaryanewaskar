package com.question6;

import java.util.Scanner;

public class SearchAnElement
{

	public static void main(String[] args) 
	{
		int size,i,num,found=0;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter Size Of Array:- ");
	     size=s.nextInt();
	     int a[]=new int[100];
	     System.out.println("Enter The Array Elements:- \n");
	     for(i=0;i<size;i++)
	        {
	            a[i]=s.nextInt();

		}
	     System.out.println("Enter The Number You Want To Search:- ");
	     num=s.nextInt();  
	     for(i=0;i<size;i++)
	        {
	            if(num==a[i])
	            {
		          System.out.println("The Position Is:- "+i);
			     found=1;
		 	  break;
	            }
	       }
	if(found==3)
		System.out.println("Not Found");

	  }

	}


