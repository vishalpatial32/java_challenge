package xor;

public class leftandrightShiftString {

	public static void main(String[] args) {
		String str = "papa";

		leftandRightShift(str);

	}


	public static boolean leftandRightShift(String str) {

		if(!str.isEmpty()) {
			for (int i = 0; i < str.length()-2; i++) {
                 System.out.println((i+2)%str.length());
				if (str.charAt(i)!= str.charAt(i+2)) {

					System.out.println("not left and right shift");
					break;
				} else if(i==str.length()-3) {
					System.out.println("left and right");
					return true;
				}
			}
		}
		return false;

	}
}
