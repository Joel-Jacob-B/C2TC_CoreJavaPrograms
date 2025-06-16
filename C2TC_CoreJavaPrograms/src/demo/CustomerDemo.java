package demo;

public class CustomerDemo {

	public static void main(String[] args) {
		
		customer cust = new customer();
		cust.setName("Joel");
		cust.setId(10);
		cust.setCity("Chennai");
		System.out.println("Customer Details are.....");
		
		System.out.println(cust.getId());
		System.out.println(cust.getName());
		System.out.println(cust.getCity());
		System.out.println(cust);
	}

}
