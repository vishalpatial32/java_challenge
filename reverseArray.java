package arrays;

import javax.print.DocFlavor.CHAR_ARRAY;

public class reverseArray {

	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println("array before reverse::" );
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		reverserArray(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("after reverse");
		
	   for(int i=0;i<arr.length;i++) {
		   
			System.out.println(arr[i]);
		}
		
		//System.out.println("array after reverse::" + arr.toString() );
	}

	private static void reverserArray(int[] arr) {
		// TODO Auto-generated method stub
		int beg = 0; int end = arr.length -1;
		while(beg < end) {
			int temp;
			temp= arr[beg];
			arr[beg]=arr[end];
			arr[end]=temp;
			beg ++;
			end--;
		}
		
	}
}
