package LAB09;

public class Student {
	String id, name;
	int year;
	public Student(String id, String name, int year) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", year=" + year + "]";
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
}
