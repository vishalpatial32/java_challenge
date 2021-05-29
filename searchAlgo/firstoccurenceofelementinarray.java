package searchAlgo;


public class firstoccurenceofelementinarray {

	public static void main(String[] args) {
		
		int arr[]= {2,4,10,10,10,18,20};
		//index 2,3,4,
		int n= arr.length-1;
		int x=10;
		System.out.println(firstoccurence(arr,n,x));
		
		
	}

	private static int firstoccurence(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		int result = -1;
		int low = 0;
		int high=n;
		int mid;
			while(low <= high) {
				
				mid = (low + high)/2;
				System.out.println(low + "\t"+ high +"\t"+ mid+ "\t"+ arr[mid] +"\t"+ result);
				if(arr[mid]==x) {
					result=mid;
				    low=mid+1;
				}
				else if(arr[mid]>x) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
				    	
				
			}
	
	return result;
	}
	
}
