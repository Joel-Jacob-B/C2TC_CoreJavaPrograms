package com.tnsif.day15.builtinobjects;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		list1.add("hello");
		list1.add(10);
		list1.add(true);
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
	}

}
