package com.question3;

import java.util.Iterator;
import java.util.TreeSet;

public class ColorExample
{

	public static void main(String[] args)
	{
		TreeSet<String> c=new TreeSet<String>();
		c.add("Pink");				
		//adding elements 
		c.add("Black");		
		//does not maintain insertion order
		c.add("Orange");
		c.add("Purple");
		for(String o:c)
		{
			System.out.println(o);
			
		}
		System.out.println("***************************************************************");
		
		TreeSet<String> c1=new TreeSet<>();
		c1.addAll(c);				
		//copying the element 
		Iterator<String> itr=c1.descendingIterator();
		
		//reversing the elements 
		while(itr.hasNext())
		{
			System.out.println(itr.next());	
		}
		System.out.println("***************************************************************");
		System.out.println(c1.equals(c));		
		//comparing 
		
		System.out.println("***************************************************************");
		System.out.println("Get first element "+c1.pollFirst());			
		//getting first element 
		System.out.println("Get Last element "+c1.pollLast());		 
		//getting last element 
	

	}



}


