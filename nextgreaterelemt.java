package arrays;

import java.util.Stack;

import comparator.main;

public class nextgreaterelemt {

	
	public static void main(String[] args) {
		long[] A = {3,5,2,4};
		int n = A.length;
		nextLargerElement(A,n);
		
	}
	
	public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        long res[]=new long[n];
        for(int i=0;i<n;i++){
            res[i]=-1;
        }
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                res[s.pop()]=arr[i];
            }
            if(i<n) s.push(i);
        }
        return res;
    }
}
