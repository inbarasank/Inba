package com.git.main;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsDemo {
	public CollectionsDemo() {
	// TODO Auto-generated constructor stub
}
	
	public static void main(String[] args) {
		System.out.println("Start exploring collections");
		 
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		
		for (Iterator<String> iterator = al.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
			System.out.println(string);
			
		}
	}
}
