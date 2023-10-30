package LAB06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrayList {
	public static <E> void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<>();
		
		
		
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
		
		list.add(0, 1);
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(4);
//		System.out.println(list.get(0));
//		
		//trả về phần tử được thay thế
		System.out.println(list.set(2, 9));
		System.out.println(list.get(2));
//		
//		//remove trả về phần tử bị xóa
//		System.out.println(list.remove(2));
//		System.out.println(list.get(2));
//		
//		//xóa tất cả phần tử trong list
//		list.clear();
//		System.out.println(list.size());
		
		
		System.out.println(list.lastIndexOf(4));
	
		System.out.println(Arrays.toString(list.toArray()));
		MyArrayList<E> listclone = (MyArrayList<E>) list.clone();
		System.out.println(Arrays.toString(listclone.toArray()));
		
		
		System.out.println(list.contains(1000));
		
		System.out.println(list.indexOf(123));
		
		System.out.println(list.remove(Integer.valueOf(123)));
		
		
	}
}
