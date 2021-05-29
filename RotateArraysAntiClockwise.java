package arrays;

public class RotateArraysAntiClockwise {

	public static void main(String[] args) {
		
		int arr[]= {5,8,11,12,2,3};
		int len= arr.length-1;
		int max=arr[len];
		int max_index=arr.length-1;
		
		for (int i = len-1; i >= 0; i--) {
			if(arr[i]<arr[max]) {
				max_index=i;
				max=arr[i];
			}
			else {
				break;
			}
		}
		System.out.println(len-max_index+1);
	}
}
