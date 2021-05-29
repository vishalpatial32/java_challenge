package hashing;

import java.util.HashMap;

public class subarraySumEqualsK {

	public static void main(String[] args) {
		
		int arr[] = {3,4,7,2,-3,1,4,2};
		int k =7;
		
		System.out.println(count(arr,k));
		
	}
public static int count(int arr[],int k) {
	
	HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
	int count=0;
	int currsum=0;
	
	for (int i = 0; i < arr.length; i++) {
	
		currsum+=arr[i];
		map.put(arr[i], 0);
		if(currsum==k) {
			count+=1;
		}
		if(map.containsKey(currsum-k)) {
			count++;
		}
	 	
	}
	
	return count;
}

} 
