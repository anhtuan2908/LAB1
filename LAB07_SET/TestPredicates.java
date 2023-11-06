package LAB07_SET;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicates {
	public static void main(String[] args) {
		Predicate<Integer> ev = new Even();
		//phuong thuc remove
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		MyPredicates.remove(list, ev);
		System.out.println(list);
		
		//phuong thuc retain
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		MyPredicates.retain(list2, ev);
		System.out.println(list2);
		
		//phuong thuc collect
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		list3.add(5);
		System.out.println(MyPredicates.collect(list3, ev));
		
		//phuong thuc collect
		List<Integer> list4= new ArrayList<>();
		list4.add(1); //index = 0
		list4.add(3);	// i=1
		list4.add(3);	// i=2
		list4.add(4);	//i=3
		list4.add(5);	//i=4
		System.out.println(MyPredicates.find(list4, ev));
		
		
	}
}
