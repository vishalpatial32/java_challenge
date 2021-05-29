package strings;

public class palindrone {

	public static void main(String[] args) {

		String S="fdsfasf";
		Boolean flag =func1(S);
		if(flag) {
			System.out.println("string is palindrone");
		}
		else {
			System.out.println("string is not palindrone");
		}
	
	}
	
	 public static boolean func1(String str){
		 
		 int min=0;
			int max=str.length()-1;
			System.out.println(min + "\t" +  max);
			while(min < max) {
				if(str.charAt(min)!=str.charAt(max)) {
				
					return false;
					}
				min++;
				max--;
			}
			
			return true;
	 }

}
