package LAB10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyLIFO_App {
	public static <E> void reverse(E[] array) {
	    Stack<E> stackReserve = new Stack<>();
	    for (E e : array) {
	        stackReserve.push(e);
	    }
	    for (int i = 0; i < array.length; i++) {
//	        if (!stackReserve.isEmpty()) {
	            array[i] = stackReserve.pop();
//	        }
	    }
	}

	public static boolean isCorrect(String input) {
		Stack<Character> myStack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				myStack.push(c);
			} else {
				if (myStack.isEmpty())
					return false;
				char openPeek = myStack.peek();
				if (c == ')' && openPeek == '(' || (c == ']' && openPeek == '[') || (c == '}' && openPeek == '{')) {
					myStack.pop();
				} else {
					return false;
				}
			}
		}
		return myStack.isEmpty();
	}
	
	
	
	
	
	public static String insertBlanks(String input) {
		String re = "";
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i)=='+' 
				|| input.charAt(i) == '-'
				|| input.charAt(i) == '*'
				|| input.charAt(i) == '/'
				|| input.charAt(i) == '('
				|| input.charAt(i) == ')' ) ;
			re = re + " " + input.charAt(i) + " ";
			
			
			}
		return re;
		}
		
	public static <E> void stutter(Queue<E> input) {
		int size = input.size();
		for (int i = 0; i < size; i++) {
			E res = input.poll();
			input.add(res);
			input.add(res);
		}
	}
		
		
	public static <E> void mirror(Queue<E> input) {
		int size = input.size();
		Queue<E> temp = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			E res = input.poll();
			input.offer(res);
			temp.offer(res);
			
		}while (!temp.isEmpty()) {
			E res = temp.poll();
			input.offer(res);
		}
		
	}
		

		
	

	public static void main(String[] args) {
		Integer[] test = { 1, 2, 3, 4, 5 };
		reverse(test);
		System.out.println(Arrays.toString(test));
		String ch = "({})";
		String ch2 = "(()";
		System.out.println(isCorrect(ch));
		System.out.println(isCorrect(ch2));
		
		Queue<Integer> t1 = new LinkedList<>();
		t1.add(1);
		t1.add(2);
		t1.add(3);
		System.out.println(t1);
		stutter(t1);
		System.out.println(t1);
		System.out.println("_______________________");
		
		Queue<String> t2 = new LinkedList<>();
		t2.add("a");
		t2.add("b");
		t2.add("c");
		System.out.println(t2);
		mirror(t2);
		System.out.println(t2);
	}

}
