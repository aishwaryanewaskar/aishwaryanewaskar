//Author:Aishwarya
//code is to display Longest Word in text file 

package com.question2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWord {
	public void FindLongestWord() throws FileNotFoundException
	{
		String longest_word=" ";
		String current_word;
		Scanner sc=new Scanner(new File("E:\\w.txt"));
		
		while(sc.hasNext())
		{
			current_word=sc.next();
			if(current_word.length()> longest_word.length());
			{
				longest_word=current_word;
			}
			System.out.println("\n"+longest_word+"\n");
			return;
		}
		
	}

	
		
		public static void main(String[] args) throws FileNotFoundException {
			new LongestWord().findLongestWords();
	    }
	}

	


