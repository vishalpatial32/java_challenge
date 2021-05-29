package codility;

public class palindroneinstrings {
	
	public static void main(String[] args) {
		String s = "anan ana refrigerator";
		String[] arr =s.split(" ");
		for(int i=0;i<arr.length;i++) {
		
			System.out.println("val :: " + arr[i]);
			
			if (palindrome(arr[i])) {
				System.out.println("palindrome :: " + arr[i]);
			}
		}
		
		  
	}
      
	public static boolean palindrome(String str){
		  
		int min=0;
		int max=str.length()-1;
		boolean flag=false;
		
		while(min<max) {
			if(str.charAt(min)!=str.charAt(max)) {
			  return false;
			}
				min++;
				max--;
			}
		
		return true;
	  }

}
