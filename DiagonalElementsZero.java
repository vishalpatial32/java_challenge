package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalElementsZero {

	public static void main(String[] args) {
		int i=4,j=3;
		System.out.println(Integer.toBinaryString(10));
		
		int arr[][] = new int[i][j];
		for (int k = 0; k < i; k++) {
			for (int k2 = 0; k2 < j; k2++) {
				if(k==k2) {
					arr[k][k2]=0;
					
				
				}
				else {
					arr[k][k2]=1;
				}
			}
			
		}
		  List<int[]> arr1 = new ArrayList<>();
          	arr1 = Arrays.asList(arr);
          	System.out.println(arr1);
	}
	
  
   
}
