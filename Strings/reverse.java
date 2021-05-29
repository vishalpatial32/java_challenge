package strings;

public class reverse {

	public static void main(String[] args) {
		
        String input = "GeeksForGeeks";
        char input1[] = input.toCharArray();
        for (int j = input1.length -1; j >= 0; j--) {
			System.out.println(input1[j]);
		}
	}
}
