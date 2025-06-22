package day6.usingfinal;

public class FinalVariable {
	public static void main(String args[]) {
	final int x = 100;

	final static int Y;

	final static int Z = 10;
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	static {
		Y = 20; 
		System.out.println("Value of Y: " + Y);
	}
	
}