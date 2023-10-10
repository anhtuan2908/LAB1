package TASK2;

public class Product implements Comparable<Product> {
	private String id;
	private String name;
	private double price;
	private String type;
	public Product(String id, String name, double price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}
	public String getId() {
		return id;
	}	
	@Override
	public String toString() {
		return  id + ", " + name + ", " + price + ", " + type ;
	}


	@Override
	public int compareTo(Product p) {
		return this.getId().compareTo(p.getId());
	}


	public int compareByType(Product p) {
		return this.getType().compareTo(p.getType());
	}
	
}
