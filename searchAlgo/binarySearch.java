package searchAlgo;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class binarySearch {

	
	public static void main(String[] args) {
		// starting time
        long start = System.currentTimeMillis();
		long n = 100000000;
		//long summation=sum(n);
		//long loopsum=summn(n);
		// ending time
        long end = System.currentTimeMillis();
        System.out.println("Counting to 10000000 takes " + (end - start) + "ms");
		//System.out.println(loopsum);
	 int arr[]= { 1,10,20,45,60,76,88};
	 int min =0;
	 int max=arr.length-1;
	 int x =45;
		
	 int pos=binary(arr,min,max,x);
	 System.out.println("elt found at position :: " + pos);
	}
	
	public static int binary(int arr[],int min,int max,int x) {
		
		int position;
		while(min <= max) {
		 int mid =min+max/2;
		 if(arr[mid]==x) {
			 position=mid;
			 return position;
		 }
		 else if (arr[mid]< x) {
			min=mid+1;
		}
		 else if(arr[mid]>x) {
			 max=mid-1;
			 
		 }
			
		}
		
		return -1;
	}
	
   }
