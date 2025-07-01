package com.tnsif.day5.singleinheritance;

// Class 1
class inherit {
	private int value;
	
	inherit() {
		this.value = 10;
	}
	
	inherit(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void display() {
		System.out.println(value);
	}
	
	public void display(String name) {
		System.out.println(name);
	}
}

// Class 2
class inherit1 extends inherit {
	String name = "Joel Jacob";
	
	inherit1(){
		super(100);
	}
}

// Class 3
public class InheritanceDemo extends inherit1 {
public static void main(String[] args) {	
	
	InheritanceDemo m = new InheritanceDemo();
	
	m.display(); // Overridden method is invoked
	System.out.println(m.getValue()); // Value from Class 1 is returned
	m.setValue(20); // Value = 20 changed
	System.out.println(m.getValue()); // New value is returned
	System.out.println(m.name); // Name from Class 2 is returned
	m.name = "Jacob"; // Name changes to "Jacob"
	System.out.println(m.name); // New name is returned
}

@Override
public void display() {
	super.display(name); // Super class is invoked
}
}