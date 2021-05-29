package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraysequal {

	public static void main(String[] args) {

		int[] arr1= { 56,23,44,18,78};
		int[] arr2= { 44,21,78,56,18};

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if (arr1.length!=arr2.length) {
			System.out.println("arrays not equal");
		}
		else {
			int count=0;
			for (int i = 0; i < arr2.length; i++) {
				if(arr1[i]==arr2[i]) {
					count++;
					continue;
				}
				else {
					System.out.println("arrays not equal");
					break;
				}
			}
			
			if (count==arr2.length) {
				System.out.println("arrays"
						+ " equal");
			}

		}
	}
}
