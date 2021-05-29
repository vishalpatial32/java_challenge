package math;

public class fibonacci_recursive {

	public static void main(String[] args) {
		int n=1;
		System.out.println(fib(n));
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		
		if(n==0) {
			return 0;
		}
		
		// if not added then we will get stackover flow error in java
		if(n==1) {
			return 1;
		}
		
		
		return fib(n-1)+fib(n-2);
		
	}
}
