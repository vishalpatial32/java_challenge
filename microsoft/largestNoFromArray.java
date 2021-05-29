package microsoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

public class largestNoFromArray {

	public static void main(String[] args) {
		
		 List<String> numbers = Arrays.asList("10", "68", "97");
		 
	        // sort using a custom function object
	    Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));

        numbers.stream().forEach(System.out::print);
		
	}

}