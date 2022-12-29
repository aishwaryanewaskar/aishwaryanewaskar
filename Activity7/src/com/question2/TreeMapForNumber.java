package com.question2;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapForNumber
{

	public static void main(String[] args)
	{
		TreeMap<Integer,Integer> map=new TreeMap<>();
		
		for(int i=1;i<=20;i++)
		{
			map.put(i, i*i);
		}
		
		for(Entry<Integer, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());		
		}
		
		TreeMap<Integer,Integer> map1=new TreeMap<Integer,Integer>();
		System.out.println("*****************************************************************");
		
		map1.putAll(map);	
		//coping one tree map to another tree map
		System.out.println(map1);
		System.out.println("*****************************************************************");
		
		System.out.println("To  search for a specific key :"+map.containsKey(7));	
		//searching a key in a treeMap
		System.out.println("To search a specific value in key: "+map.containsValue(9));	
		//searching a key in a treeMap
		System.out.println("*****************************************************************");
		System.out.println("To find greatest key "+map.higherKey(19));
		//to get a greatest key
		
		System.out.println(map.pollFirstEntry());	
		//to get and remove key
		System.out.println(map.pollLastEntry());
		//to get and remove greatest key
		System.out.println(map);
		
				
	}


}


