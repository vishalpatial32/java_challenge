package strings;

import comparator.main;

public class ReverseWordSentence {

	public static void main(String[] args) {
		
		String str = "hello world";
		 reverse_sentence(str);
	
	}
	
	public static boolean reverse_sentence(String str) {
		if(str==null || str==" ") {
			System.out.println("string is null");
			return false;
		}
		else {
			String[] str1 = str.split(" ");
			for (int j = str1.length-1; j >=0; j--) {
				System.out.println(str1[j]);
			}
		}
		
		return false;
		
	}
}
