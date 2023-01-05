//Author:Aishwarya Newaskar
//program to illustrate the String Classes

package com.question3;

public class StringClasses
{

	public static void main(String[] args)
	{
		 //Create a string using String class
		 System.out.println("String class");
		  String str="Hi Aishwarya!";
				
		//Illustrate the charAt,compareTo,conCat ,indexOf,replaceAll,substring,and toLowerCase methods
		 System.out.println("character at index is:- "+str.charAt(0));
		 System.out.println("Comparing string:- "+str.compareTo("Hi Aishwarya!"));
		 System.out.println("concat string:- "+str.concat("GOOD AFTERNOON"));
		 System.out.println("index of string:- "+str.indexOf("A"));
		 System.out.println("replaceAll string:- "+str.replaceAll("A", "A"));
		 System.out.println("substring:- " +str.substring(6));
		 System.out.println("string to lower:- "+str.toLowerCase());
				
		 System.out.println("**************************************************************");
		 System.out.println("StringBuffer class:- ");
				
		//Create a string using the StringBuffer class
		 StringBuffer s1=new StringBuffer("Hi");
				
	   //Illustrate the append,insert,reverse,and replace methods
		 s1.append("Rutuja ");
			System.out.println("append a string:- "+s1);
		 s1.insert(9, "HOW ARE YOU? ");
			System.out.println("inserting string "+s1);
		 s1.reverse();
			System.out.println("reverse a string:- "+s1);
		 s1.replace(0,10, "GOODBYEE");
			System.out.println("replace a string:- " +s1);
				
			System.out.println("**************************************************************");
			System.out.println("StringBulider class: ");
				
		//Create a string using the StringBuilder class
			StringBuilder s2=new StringBuilder("HELLO EVERYONE ");
				
		//Illustrate the append,substring,and length methods
		 s2.append("GOOD EVENING");         
			System.out.println("append a string builder:"+s2);
			System.out.println("adding substring:- "+s2.substring(6));
			System.out.println("lenght of string:-"+s2.length());
				

	}

}


