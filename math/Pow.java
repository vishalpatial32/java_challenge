package math;

public class Pow {

	public static void main(String[] args) {
		
		int x=2;
		int n =3;
		pow(x,n);
	}
	
	public static void pow(int x,int n) {
		
		int i=0; int result=1;
		while(i<n) {
			result*=x;
			i++;
		}
		
		System.out.println(result);
	}
}
