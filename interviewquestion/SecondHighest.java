
public class SecondHighest {

	
	public static void main(String[] args) {
		
		int arr[] = {3,2,4,5,1};
		
		int firstmax ;
		int secondmax;
		firstmax = Integer.MIN_VALUE;
		secondmax  = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(firstmax <arr[i]) {
				firstmax=arr[i];
			}
						
		}
		
		System.out.println("firstmax " + firstmax);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=firstmax && secondmax<arr[i]) {
				secondmax=arr[i];
			}
		}
		System.out.println("second max " + secondmax);
	}
	
}
