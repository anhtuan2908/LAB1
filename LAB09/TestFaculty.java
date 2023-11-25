package LAB09;

import java.util.ArrayList;
import java.util.List;

public class TestFaculty {
	public static void main(String[] args) {
		Student st1 = new Student("12", "Tuan", 2023);
		Student st2 = new Student("321", "Phuc", 2022);
		Student st3 = new Student("23", "Trung", 2023);
		Student st4	= new Student("09", "Phuoc", 2022);
		Student st5	= new Student("777", "Hai", 2024);
		
		List<Student> listStu = new ArrayList<>();
		listStu.add(st1);
		listStu.add(st2);
		listStu.add(st5);
		
		List<Student> listStu2 = new ArrayList<>();
		listStu2.add(st3);
		listStu2.add(st4);
		
		
		Course co1 = new Course("22", "LTNC", "TH", "Mr.Du", listStu);
		Course co2 = new Course("33", "LTCB", "TH", "Mrs.Tram", listStu2);
		
		List<Course> listCo = new ArrayList<>();
		listCo.add(co1);
		listCo.add(co2);
		
		Faculty fc1 = new Faculty ("CNTT", "DAIHOCNONGLAM", listCo);
		
		System.out.println(fc1.getMaxPracticalCourse());
		System.out.println("--------------------------");
		System.out.println(fc1.groupStudentsByYear());
		System.out.println("--------------------------");
		System.out.println(fc1.filterCourses("TH"));
	}
}
