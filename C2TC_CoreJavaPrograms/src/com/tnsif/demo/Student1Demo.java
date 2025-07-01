package com.tnsif.demo;

public class Student1Demo {

	public static void main(String[] args) {
		Student1 st = Student1.getObject();
		
		st.setId(10);
		st.setName("Joel Jacob B");
		
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st);
		
        Student1 st1 = Student1.getObject();
		
		st1.setId(12);
		st1.setName("Joel");
		
		System.out.println(st1.getId());
		System.out.println(st1.getName());
		System.out.println(st1);

	}

}
