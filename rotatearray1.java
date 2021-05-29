package arrays;

public class rotatearray1 {

	public static void main(String[] args) {
		
		int   arr[] = {1, 2, 3, 4, 5};
	//Output: arr[] = {5, 1, 2, 3, 4}
		
		int x = arr.length -1;
		System.out.println(x);
		for (int i = 0,j=i+1; i < arr.length -1; i++) {
			arr[j]=arr[i];
			if(j==arr.length-1) {
				break;
			}
		}
		arr[0] =x ;
		
		for (int i = 0; i < arr.length -1; i++) {
			
		System.out.println(arr[i]);
		}
	}
}
