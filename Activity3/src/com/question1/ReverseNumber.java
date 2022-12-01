//Author:Aishwarya
//code is to Reverse Number

package com.question1;
import java.util.Scanner;
public class ReverseNumber {

	public void reverseNumber()
		 {
		     System.out.println("enter the number to reverse:"); 
			      Scanner sc=new Scanner(System.in);
			      int number=sc.nextInt();
			      int reverse=0;
			      
			         while(number!=0)
			         {
			    	    int remainder=number%16;          
			    	    reverse=reverse*16+remainder;
			    	    number=number/16;
			         }
			 System.out.println("the reverse of the given no is:"+reverse);
			
		             }	
	            }
	               	class SumOfDigits extends ReverseNumber
		        {
		         	public void SumOfDigit()
			    {
				    System.out.println("enter the number to find sum of digits:");
				    Scanner sc=new Scanner(System.in);
				    int number=sc.nextInt();
				
			     	int sum=0,digit;
				
			     	while(number>0)
				{
					digit=number%16;          
					sum=sum+digit;
					number=number/16;
				}
				    System.out.println("sum of digits is"+sum);
			}
			
		}
		           public class Que2 extends SumOfDigits
		{

		          public static void main(String[] args) 
		   {
			
			     SumOfDigits s=new SumOfDigits();
			   
			      s.SumOfDigit();   
			      s.reverseNumber();   
			
			
		}
	}

