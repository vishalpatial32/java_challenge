package arrays;

import java.util.HashMap;

public class maxXORsum {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		HashMap<Integer, Integer> map= new HashMap<>();
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			
			
			sum+=arr[i];
			map.put(arr[i],sum);
		}
	
	}
}
