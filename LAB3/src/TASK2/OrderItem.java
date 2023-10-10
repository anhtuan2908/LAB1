package TASK2;

public class OrderItem implements Comparable<OrderItem>{
	private Product p;
	private int quality;
	public OrderItem(Product p, int quality) {
		super();
		this.p = p;
		this.quality = quality;
		
	}
	public int getQuality() {
		return quality;
	}
	public Product getP() {
		return p;
	}
	@Override
	public int compareTo(OrderItem o) {
		
		return this.getP().compareTo(o.getP());
	}
	@Override
	public String toString() {
		return ""+ this.getP() + this.getP().toString();
	}


	public int compareByType(OrderItem o2) {
		return this.getP().compareByType(o2.getP());
	}

	
}
