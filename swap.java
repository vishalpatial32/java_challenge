package arrays;

public class swap {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("before swap :: " + a + "\t" +  b );
		swapnum(a,b);
		
	}
	
	static void swapnum(int x,int y){
		
		int z;
		z=x;
		x=y;
		y=z;
		
		System.out.println("after swap :: " + x + "\t" + y );
	}
	
}
