package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hackerrank_pairofsocks {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 10, 10, 30, 50, 10, 20};
		pairs(arr);
	}
	public static int pairs(int arr[]) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				
				map.put(arr[i], map.get(arr[i])+1);
				//System.out.println(map.get(arr[i]));
			}else {
				map.put(arr[i],1);
			}

		}
		
		 for (Map.Entry<Integer, Integer> entry : map.entrySet())
	        {   
			    if(entry.getValue()==2)
	            System.out.println(entry.getKey() + " " + entry.getValue());
	        }
		
		return 0;
		
	}
	

}
