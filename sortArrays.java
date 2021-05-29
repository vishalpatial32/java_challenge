package arrays;

public class sortArrays {

	public static void main(String[] args) {
		int arr[]= { 0,1,2,0,1,2};
		
		sortArray(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
	  for (int i = 0; i < arr.length -1; i++) {
			System.out.println(arr[i]);
		}
		//System.out.println(arr);
	}

	private static void sortArray(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length-2;i++) {
			
			for (int j = 0; j < arr.length -1; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
}
