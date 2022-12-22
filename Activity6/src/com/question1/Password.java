package com.question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Password");
		String password=s.next();
		String regex = "[A-Za-z0-9@*#]{8}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        boolean matchFound = m.find();
        if(matchFound)
        System.out.println("Password is Valid and You can continue with online Shopping");
        else
        System.out.println("Invalid Password, Try Again!");
    }
}


