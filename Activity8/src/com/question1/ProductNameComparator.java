//Author:Aishwarya Newaskar
//Sorting based on name and price of product using  comparator

package com.question1;

import java.util.Comparator;

public class ProductNameComparator implements Comparator
{               //sorting product by name
		
	public int  compare(Object o1,Object o2)
	       {
	    	   Product p1=(Product) o1;
	    	   Product p2=(Product) o2;
	    	 //comparing product name using CompareTo method and returning value
	    	   return p1.Pname.compareTo(p2.Pname);
	       }
}

