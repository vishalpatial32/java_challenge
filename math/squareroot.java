package math;

public class squareroot {

	public static void main(String[] args) {
		
		int m=27;
		
	   System.out.println(sqrt(m));
	}
	private static int sqrt(int m) {
		
		for (int i = 1; i < m; i++) {
			
		
		if ((i*i)==m) {
			return i;
		}
		if(i*i > m) {
			return i-1;
		}
		// TODO Auto-generated method stub
		}
		return 1;
	}
}
