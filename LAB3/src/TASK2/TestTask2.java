package TASK2;

import java.util.Arrays;

public class TestTask2 {
	public static void main(String[] args) {
		Product p1 = new Product("23", "COCA", 10, "Zero");
		Product p2 = new Product("50", "PEPSI", 20, "CHANH KHONG CALO");
		Product p3 = new Product("78", "COCA", 10, "Plus");
		Product p4 = new Product("29", "PEPSI", 15, "Original");
		
		OrderItem oi1 = new OrderItem(p1, 2);
		OrderItem oi2 = new OrderItem(p2, 2);
		OrderItem oi3 = new OrderItem(p3, 2);
		OrderItem oi4 = new OrderItem(p4, 2);
		
		
		
		OrderItem totalItems[] = {oi1 , oi2, oi3 , oi4};
		
		Order total = new Order(totalItems);
		
		
		System.out.print("Test Cost: ");
		System.out.println(total.cost());
		System.out.print("Test Contain: ");
		System.out.println(total.contains(p2));
		System.out.println("Test Filter");
		System.out.println(Arrays.toString(total.filter("Original")));
		
		
	}
	
	
	
	
}
