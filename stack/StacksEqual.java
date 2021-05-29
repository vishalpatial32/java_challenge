package stacks;

import java.util.Stack;

public class StacksEqual {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		
		s1.push(3);
		s1.push(4);
		s1.push(2);
		s1.push(1);
		System.out.println(s1.size());
		
		s2.push(3);
		s2.push(4);
		s2.push(2);
		s2.push(1);
		
		comparestack(s1, s2);
	}
	
	public static void comparestack(Stack<Integer> s1, Stack<Integer> s2){
		
		
	};
}
