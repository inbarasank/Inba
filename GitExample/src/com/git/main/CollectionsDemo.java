package com.git.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionsDemo {
	public CollectionsDemo() {
	// TODO Auto-generated constructor stub
}
	
	public static void main(String[] args) {
		System.out.println("Start exploring collections");
		 
		
		ArrayList<String> al = new ArrayList<String>();
		
		HashSet<String> hs = new HashSet<String>();
		
		System.out.println("");
		al.add("First");
		
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		al.add("Fourth");
		
		for (Iterator<String> iterator = al.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			
			System.out.println(string);
			
		}
		
		hs.addAll(al);
		System.out.println("");
		for (Iterator<String> iterator = hs.iterator(); iterator.hasNext();) {
			String object = (String) iterator.next();
			System.out.println(object);
			
		}
	}
}
