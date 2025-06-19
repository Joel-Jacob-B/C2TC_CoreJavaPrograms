package demo;

public class Student1 {
	private int id;
	private String name;
	private static Student1 obj = new Student1();
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static Student1 getObject() {
		return obj;
	}

	@Override
	public String toString() {
		return "Student1 [id= " + id + ", name= " + name + "]";
	}
	
	
}
