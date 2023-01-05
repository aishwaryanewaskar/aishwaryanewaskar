//Author:Aishwarya Newaskar
//adding and retrieving the state name

package com.question2;

public class StateMain 
{

	public static void main(String[] args) 
	{
		State s=new State();
		s.addState("Maharshatra");			//adding sate name
		s.addState("Goa");
		s.addState("Punjab");
		s.addState("Arunachal Pradesh");
		
		System.out.println("Retrive the details of state:"+s.retriveState("Gujarat"));
		//Retrieves the specific state name 

	}

}


