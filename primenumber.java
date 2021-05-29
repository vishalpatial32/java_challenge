package arrays;

import java.sql.SQLRecoverableException;
import java.util.Arrays;
import java.lang.Math;

public class primenumber {

	public static void main(String[] args) {
		int n =100;
		/*boolean[] arr = new boolean[n];
		Arrays.fill(arr,true);
		int cnt_true;
		int cnt_false;
		arr[0]= true;*/
		
		System.out.println(isprime(n));
	     
		
}
	public static boolean isprime(int x) {
		
		for(int i=2;i<java.lang.Math.sqrt(x);i++) {
			if(x%i==0) {
				return false;	
			}
		}
		
		return true;
	}
}

