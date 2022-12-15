//Author: Aishwarya
//code is to display read and write contends

package com.question1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteContent
{
static void readwrite() throws IOException
{
	System.out.println("Enter the choice 1 for write and 2 for read");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	if(choice==1)
	{
		FileOutputStream Fout=new FileOutputStream("D://ap.txt");
		String s="Welcome To India";
		byte b[]=s.getBytes();
		Fout.write(b);
		Fout.close();
	}
	else if(choice==2)
	{
		FileInputStream fin=new FileInputStream("E://ap1.txt");
		while((choice=fin.read())!=-1);
		System.out.print((char)choice);
	}
	
	fin.close();
}
else
{
	System.out.println("Invalid input");
}
	System.out.println("Sucessfully Done");

 
	public static void main(String[] args)
	{
		try
		{
			readwrite();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
