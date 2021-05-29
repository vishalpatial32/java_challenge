package math;

public class maxof2no {

	public static void main(String[] args) {
		
		int a =10;
		int b=20;
		int c=30;
		
		
		//int max=max2nos(a,b);
		int max3=max3nos(a,b,c);
		System.out.println(max3);
	}
	
	public static int max2nos(int a,int b){
		int max;
		max=(a>b)?a:b;
		return max;
	}
	
	public static int max3nos(int a,int b,int c){
		int max;
		max=(a>b) && (a>c)?a:(b>a) && (b>c)?b:c;
		return max;
	}
}
