package com.question1;

public class PrintFirstAndLastNo {

	public static void main(String[] args) {
		 int number = 1768892;
		    int firstDigit = 0;
		    int lastDigit = 0;

		    // To find the last digit of the number 
		    lastDigit = Math.abs(number % 10);

		    // To find the first digit of the number
		    while (number != 0) {
		      firstDigit = Math.abs(number % 10);
		      number /= 10;
		    } 
		    System.out.println("The First digit of the given number is: " + firstDigit);
		    System.out.println("The Last digit of the given number is: " + lastDigit);
		  }
		

	}


