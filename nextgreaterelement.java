package arrays;

import java.util.ArrayList;

public class nextgreaterelement {

	
	public static void main(String[] args) {
		
		int a[] = {5, 6, 7};
		nextgreaterelement(a);
		
		
	}
	
	
	public static void nextgreaterelement( int arr[]) {
		
		int n = arr.length;
		int arr1[]= new int[n];
		
		//printing array
		for (int i = 0; i < arr.length; i++) {
        	System.out.println("old array is " + arr[i]);
		}
		
		//new array
		for (int i = 0; i < arr.length; i++) {
			int last = arr.length -1;
			
			if(i!= last) {
			arr1[i] = arr[i] -1;
			}
			else {
				arr1[i]= -1;
			}
		}
		
         
		System.out.println("\n");
        for (int i = 0; i < arr1.length; i++) {
        	System.out.println("new array is  " + arr1[i]);
		}
        
	}
}
