//Author:Aishwarya Newaskar
//adding and retrieving the state name

package com.question2;

import java.util.HashSet;
import java.util.Iterator;

public class State 
{
	
	HashSet<String> hs=new HashSet<String>();
	void addState(String stateName)		
	{
		hs.add(stateName);		
		//adding state
	}
	
	String retriveState(String stateName)
	{
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			if(hs.contains(stateName))		
			  //specific state name 
			{
				return stateName;			
				//returning the state name 
			}	
		}
		  return null;	
	}
}

