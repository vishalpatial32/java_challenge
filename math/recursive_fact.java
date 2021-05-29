package math;

public class recursive_fact {
	
	public static void main(String[] args) {
		
		int n=0;
	    System.out.println(factorial(n));
	  
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		
		// if n==1 is written then in case of n=0,we will get stack overflow error
		if(n==0) {
			return 1;
		} 
		
		return (n* factorial(n-1));
	}

}
