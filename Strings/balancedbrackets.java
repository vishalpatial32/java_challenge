package strings;

import java.util.ArrayDeque;
import java.util.Deque;

public class balancedbrackets {
	
public static void main(String[] args) {
	
	String expr = "(dfafaf990";
	boolean str =balanced(expr);
	
	
}

public static boolean balanced(String S) {
	
	Deque<Character> stack = new ArrayDeque<Character>();
	boolean flag;
	for (int i = 0; i < S.length(); i++) {
	   char expr = S.charAt(i);
		if(expr =='(' || expr == '{' || expr == '[') {	   
		stack.push(expr);
		System.out.println(stack.toString());
		continue;
	}
	
	if(stack.isEmpty()) {
		System.out.println("no elemets");
	}
	else {
		
		char check = S.charAt(i);
		switch(check) {
		
		case '}' :
			if( check == ')' || (check == ']')) {
				break;
			}else {
				stack.pop();
			}
			
		case ')' :
			if( check == '}' || (check == ']')) {
				break;
			}else {
				stack.pop();
			}
			
			
		case ']' :
			if( check == '}' || (check == ']')) {
				break;
			}else {
				stack.pop();
			}
		
		}
	}
	
}
	if(stack.isEmpty()) {
	
	System.out.println("balanced");	
	 flag =true;
	}
	else {
		System.out.println("not balanced");
		 flag =true;

	}
	return flag;
}
}
