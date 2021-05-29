package arrays;

public class RotateArraysClockwise {

	public static void main(String[] args) {
		int arr[]= {12,11,2,3,5,8};
		int min=arr[0];
		int n=arr.length-1;
		int min_index=0;

		for (int i = 1; i < arr.length; i++) {

			if(arr[i]< min)
			{
				min=arr[i];
				min_index=i;
			}  
			else {
				break;
			}
		}
		System.out.println(min_index);
	}
}
