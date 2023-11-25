package LAB09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Faculty {
	String name, address;
	List<Course> courses;
	
	
	public Faculty(String name, String address, List<Course> courses) {
		super();
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
	

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}


	public Course getMaxPracticalCourse() {
        Course maxPracticalCourse = null;
        int maxStu = 0;

       for (Course co : courses) {
		if (co.getType().equals("TH")) {
			int current = co.getStudents().size();
			if (current > maxStu) {
				maxStu = current;
				maxPracticalCourse = co;
			}
		}
	}
		return maxPracticalCourse;
    }

	public Map<Integer, List<Student>> groupStudentsByYear() {
		 Map<Integer, List<Student>> res = new HashMap<>();
	        for (Course c : courses) {
	           for (Student st : c.getStudents()) {
				int key = st.getYear();
				List<Student> values = new ArrayList<>();
				if (!res.containsKey(key)) {
					values.add(st);
				}else {
					values = res.get(key);
					if (!values.contains(st)) {
						values.add(st);
					}
				}
				res.put(key, values);
			}

	       
	        }
			return res;
	}
	public Set<Course> filterCourses(String type){
       List<Course> filteredList = new ArrayList<>();

       
       for (Course c : courses) {
           if (c.getType().equals(type)) {
               filteredList.add(c);
           }
       }

       
       Collections.sort(filteredList, new Comparator<Course>() {
           @Override
           public int compare(Course course1, Course course2) {
               int studentCount1 = course1.getStudents().size();
               int studentCount2 = course2.getStudents().size();

               
               return Integer.compare(studentCount2, studentCount1);
           }
       });

       
       return new HashSet<>(filteredList);
   }
}
	
	
	

