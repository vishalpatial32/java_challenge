package xor;

public class xor1 {

	public static void main(String[] args) {
		
		int n=10;
		//and operation
		// 1010
		// 0001
		System.out.println(n&1);
		//left shift by 1
		//1010
	   //10100 
		System.out.println(n<<1);
	
	if((n&1)==0) {
		System.out.println("no is odd ");
	}else {
		System.out.println("no is even");
	}
	
	// right shift
	int x = -1;
	System.out.println(x>>1);
	
	//power of 5^4
	int m =5;
    System.out.println("pow ::\n");
    System.out.println(m>>1);	
	// encryption & decryption
	int a=10; int b =20;
	int c = a^b;
	a=c^a;
	b=c^b;
	System.out.println("a and b :: "+ a + "\t"+ b );
	}
	
	
}


// 1010
// 0001