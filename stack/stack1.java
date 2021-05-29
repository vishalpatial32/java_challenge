package stacks;

import java.util.Iterator;
import java.util.Stack;

import comparator.main;

public class stack1 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(12);
		stack.push(19);
		stack.push(111);
		
		for (Iterator iterator = stack.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		int popped =stack.pop();
		System.out.println(popped);
		System.out.println("\n");
		
		int peeked = stack.peek();
		System.out.println(peeked);
		
		for (Iterator iterator = stack.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
