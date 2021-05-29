package strings;

public class stringpattern {

	public static void main(String[] args) {
		    
		    String txt = "AABAACAADAABAAABAA";
		                  
		    String pat = "AABA";
		    
		    pattern(txt,pat);
		    
	}
	
	 private static void pattern(String txt, String pat) {
		// TODO Auto-generated method stub
		 
		 int m = txt.length();
		 int n =pat.length();
		  System.out.println(m-n);
		 for (int i = 0; i < m-n; i++) {

               for (int j = 0; j < n; j++) {
				if(txt.charAt(i+j)!=pat.charAt(j)) {
					break;
				}
				if(j+1==n) {
					System.out.println("pattern found at index :: " +(i) );
				}
			}
		}
		
	}

	
}
