//Author:Aishwarya Newaskar
//Sorting based on name and price of product using  comparator

package com.question1;

import java.util.ArrayList;
import java.util.Collections;

public class ProductMain
{
	
	public static void main(String[] args)
	{   
		
		Product p1=new Product(1,"Aishwarya",20000);        //adding product details
		Product p2=new Product(2,"Pooja",10000);
		Product p3=new Product(3,"Riya",9000);
		Product p4=new Product(4,"raj",7000);
		
		ArrayList<Product> pl=new ArrayList<>();
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		pl.add(p4);
		
		Collections.sort(pl,new ProductPriceComparator());
		System.out.println("Sorting based on price of product");     //sorting product by price
		for(Product p:pl)
		{
			System.out.println(p.price+" "+p.Pname);
		}
		System.out.println("************************************");
		System.out.println("Sorting based on name of product");      //sorting product by name
		Collections.sort(pl, new ProductNameComparator());
		for(Product p:pl)
		{
			System.out.println(p.Pname);
	}

	}

}