package strings;

import comparator.main;

public class substringsofString {
	
	public static void main(String[] args) {
		
		String str = "abbc";
		System.out.println(str);
		
		String str1 = "gooseBumps";
		String str2= "bumps";
		
		subStrng(str1,str2);
		
	}
	
	
	public static String subStrng(String s1, String s2) {
		
		int len1= s1.length();
		int len2= s2.length();
		
		if(len1 !=0 && len2!=0) {
			
			for (int i = 0; i < s2.length(); i++) {
				for (int j = i+1; j < s2.length(); j++) {
					
				}
			}
			
		}
		return "res";
	}
	
	 public static String substring(String str) {
		 
		 for (int i = 0; i < str.length(); i++) {
				
				for (int j = i+1; j <= str.length(); j++) {
					System.out.println(str.substring(i,j));
				}
			}
		 return str;
	 }

}
