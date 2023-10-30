package LAB06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class MyArrayList<E> {
	public static final int DEFAULT_CAPACITY = 10;
	private E[] elements;
	private int size;
	
	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
		}
		public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
		}
		
	public void growSize() {
		if (size == elements.length) {
			E[] newElement = (E[]) new Object[elements.length * 2];
			newElement = Arrays.copyOf(elements, size);
			elements = newElement;
		}
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean add(E e) {
		if (size == elements.length) {
			growSize();
		}
		 elements[size] = e;
		 size++;
		 return true;
		}
	
	public void add(int i, E e) throws IndexOutOfBoundsException {
		if (i <0 || i > size ) {
			throw new IndexOutOfBoundsException();
		}
		if (size == i) {
			growSize();
		}
			for (int j = i+1; j < size; j++) {
				elements[j] = elements[j-1];
			}
			elements[i] = e;
			size++;
			
			
		
	}
	public E get(int i) throws IndexOutOfBoundsException{
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException();
		}else {
			return elements[i];
		}			
	}

	public E set(int i, E e) throws IndexOutOfBoundsException {
		if (i<0 || i >= size) {
			throw new IndexOutOfBoundsException();
		}else {
			E temp =  elements[i];
			elements[i] = e;
			return temp;
			
		}
	}
	
	public E remove(int i) throws IndexOutOfBoundsException {
		if (i<0 || i >= size) {
			throw new IndexOutOfBoundsException();
		}else {
			E removeElement = elements[i];
			for (int j = i; j < size-1; j++) {
				elements[j] = elements[j+1];
			}
			size--;
			return removeElement;
		}	
	}
	
	public void clear() {
		int length = size;	
		for (int i = 0; i < length; i++) {
			elements[i] = null;
			size--;
		}
	}
	
	public int lastIndexOf(Object o) {
		
		int res = -1;
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(o) ) {
			res = i;
			}
		}
		return res;
		}

	public E[] toArray() {
		E[] res = (E[]) new Object[size];
		for (int i = 0; i < size; i++) {
			res[i] = elements[i];
		}
		return res;
		}
	
	public MyArrayList<E> clone() {
		MyArrayList<E> newList = new MyArrayList<>();
	    newList.elements = Arrays.copyOf(this.elements, this.size);
	    newList.size = this.size;
	    return newList;
	}
	
	public boolean contains(E o) {
		for (E t : elements) {
			if (t.equals(o)) {
				 return true;
			}
		}
		return false;
		}
	
	public int indexOf(E o) {
		for (int i = 0; i < size; i++) {
			if (elements[i] == o) {
				return i;
			}
		}
		return -1;
		}

	public boolean remove(E o) {
		int index = indexOf(o);
	    if (index >= 0) {
	        remove(index);
	        return true;
	    }else {
			return false;
		}
	    
	}
	
	public void sort(Comparator<E> c) {
		Arrays.sort(elements, 0, size, c);	
	}
	
	
	
	
}
