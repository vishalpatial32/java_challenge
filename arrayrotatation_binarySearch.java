package arrays;

import comparator.main;

public class arrayrotatation_binarySearch {

	public static void main(String[] args) {

		int arr[]= {15,22,23,28,31,38,5,6,8,10,12};
		int n=arr.length-1;
		System.out.println(binarysearchrotatation(arr,n));


	}

	public static int binarysearchrotatation(int arr[],int n){



		int low=0;
		int high=arr.length-1;


		while(low<=high) {

			int mid =(low+high)/2;	
			int prev=(mid+n-1)%n;
			int next=(mid+1)%n;
			//case 1

			if(arr[low]<=arr[high])
				return low;

			// case2
			if(arr[mid]<arr[prev] && arr[mid]<arr[next]) 
				return mid;


			//case 3
			if(arr[mid] <arr[high]) 

				high=mid-1;

			//case 4 
			if(arr[mid] >arr[low]) 

				low=mid+1;

		}



		return -1;
	}
}
