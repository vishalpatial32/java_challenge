package bitwise;

public class bitwise1 {

	public static void main(String[] args) {
		
		long a = 128;
		boolean flag= ispower(a);
		if(flag) {
			System.out.println("power of two");
		}else {
			System.out.println("not a power of two");
		}
		
	}
	
	public static boolean ispower(long a) {
		if(a!=0) {
			if(a%2==0) {
				return true;
			}
		}
		
    return false;		
	}
}
