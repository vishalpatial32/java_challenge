package arrays;

public class firstRepeatingelement {

	// complexity O(n^2)
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1};
		for (int i = 0;i < arr.length -1; i++) {
			for (int k = i+1; k < arr.length; k++) {
				if (arr[i]==arr[k]) 
					System.out.println("first repeating element is :: " + arr[i]);
						
			}
			
		}
				
	}
}
