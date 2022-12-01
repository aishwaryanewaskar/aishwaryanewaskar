//Author:Aishwarya 
//Code to find the lower case with underscore 

package com.question2;

public class Sequenceoflowercaseletters {

public static void main(String[] args) {
		String s="aishwarya_newaskar";
		
		  boolean b=false;
	   
		    for(int i=0;i<s.length();i++)      
		    {
		    	if(s.charAt(i)=='_')
			{
				if(Character.isLowerCase(0));
				b=true;
				break;
			}
		}
		        if(b)
		        	System.out.println("matched");
		         else
		        	System.out.println("not matched");

	   }

	}
