package day4.thirdpackage;

public class PrivateConstructorDemo {
	public static void main(String s[]) {
		// Can't create object with private constructor
		// MyClass m1=new MyClass();
		
		MyClass m=MyClass.getObject();
		m.setId(10);
		System.out.println(m);
		
		MyClass m1=MyClass.getObject();
		m1.setId(20);
		
		System.out.println(m1);
		
	}
}
