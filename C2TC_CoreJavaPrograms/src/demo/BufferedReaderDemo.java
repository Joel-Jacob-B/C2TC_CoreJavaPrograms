package demo;
import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		String name = reader.readLine();
		
		System.out.println("Enter your age: ");
		int age = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter your salary: ");
		double salary = Double.parseDouble(reader.readLine());
		
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Salary: "+ salary);

	}

}
