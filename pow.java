package arrays;

public class pow {
	
	public static void main(String[] args) {
		
		
		int a =2;
		int b=-5;
		System.err.println();
		System.out.println(b);
		int c= power(a,b);
		System.out.println(c);
	}

	private static int power(int a, int b) {
		// TODO Auto-generated method stub
		int output =1;
		
		if(b==0) {
			
			return 1;
		}
		else {
			while(b!=0) {
				output*=a;
				b--;
			}
			
			if(b<0) {
				if(b%2==0){
					System.out.println("do nothing");
				}
				else {
					output*=-1;
				}
			}
			return output;
		}
		
	}

}
