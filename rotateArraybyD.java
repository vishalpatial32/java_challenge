package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class rotateArraybyD {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int d =2;
        
		//method 1 
		rotate(arr,d);
		
		//method 2
		rotate1(arr,d);
		
	   //method 3
		rotate2(arr,d);
	}
	
	// 1. reverse d elts 2. rev n-d elts 3. reverse n elements
	private static void rotate2(int[] arr, int d) {
		// TODO Auto-generated method stub
		
	}

	// time complexity --- O(n*d)
	private static void rotate1(int[] arr, int d) {
		// TODO Auto-generated method stub
		
		//put 2 elts in end
		for (int i = 0; i < d; i++) {
			
			int temp=arr[0]; 
			int n = arr.length;
			
			for (int j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			} 
			arr[n-1]=temp;
			
			
		}
		
		//printing elements of array
		for (int i = 0; i < arr.length; i++) {
			System.err.println(arr[i]);
			
		}
		
	}

	// method 1 
	public static void  rotate( int [] arr,int d ) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = d; i < arr.length; i++) {
			
			list.add(arr[i]);
			
		}
		
		for (int i = 0; i < d; i++) {
			list.add(arr[i]);
			
		}
		
		//iterate over list
		
       for (Integer integer : list) {
		System.out.println(integer);
	}
	}
}
