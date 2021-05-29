package sortingalgo;

public class bubblesort {
	
	public static void main(String[] args) {
		
		int arr[]= {45,20,40,05,15,25,50,35,30,10};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		bubblesort(arr);
		
	}
	
	public static void bubblesort(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("after sorting \n");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
