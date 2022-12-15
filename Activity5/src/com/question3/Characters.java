//Author:Aishwarya
//code is to display the number of char,words,lines in a text file 
package com.question3;

import java.io.*;

public class Characters {
	static int lines=0,chars=0,words=0;
	static int code=0;
public static void totalCount(FileInputStream fin) throws IOException	
{
	while(fin.available()!=0)
	{
		code=fin.read();
		if(code!=8)
			chars++;
		if(code==10)
			words++;
		if(code==13)
		{
			lines++;
			words++;
		}
	}
}

	public static void main(String[] args) {
		try
		{
			FileInputStream f=new FileInputStream("E:\\c.txt");
			totalCount(f);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("cannot find the specifide file..");
		}
		catch (IOException i)
		{
          System.out.println("cannot read file..");			
		}
		System.out.println("No of characters="+chars);
		System.out.println("No of words="+(words+1));
		System.out.println("No of lines="+(lines+1));
	}

}
