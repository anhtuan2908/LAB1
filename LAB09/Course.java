package LAB09;

import java.util.List;

public class Course  {
	
	String id, title, type, lecturer;
	List<Student> students;
	
	
	public Course(String id, String title, String type, String lecturer, List<Student> students) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.lecturer = lecturer;
		this.students = students;
	}
	public String getType() {
		return type;
	}
	public List<Student> getStudents() {
		return students;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", type=" + type + ", lecturer=" + lecturer + ", students="
				+ students + "]";
	}
	
	
}
