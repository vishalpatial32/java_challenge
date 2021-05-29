package microsoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class countTimeUsingInput {

public static ArrayList<String> list=new ArrayList<String>();//Creating arraylist.

	public static void getPermutations(int[] array){  
		helper(array, 0);  

	}  

	private static void helper(int[] array, int pos){  
		  String str = "";
		if(pos >= array.length - 1){   
            
			
			for(int i = 0; i < array.length - 1; i++){  
				//System.out.print(array[i] );
			     str+=String.valueOf(array[i]);

			}  

			if(array.length > 0)   
				//System.out.print(array[array.length - 1]);
				str+=String.valueOf(array[array.length - 1]);
				//list.add(String.valueOf(array[i])); 

      		//System.out.println();  
      		list.add(str);
			return;  

		}  

		for(int i = pos; i < array.length; i++){   

			int t = array[pos];  
			array[pos] = array[i];  
			array[i] = t;  
			helper(array, pos+1);  


			t = array[pos];  
			array[pos] = array[i];  
			array[i] = t;  

		}  

	}
	
	
	public static boolean regex_timestamp(String x) {
		
		 String a=x.substring(0,2);
		 String b=x.substring(2,4);
		 String c= a+":"+b;
		 //System.out.println(x);
		 System.out.println(c);
		 String pattern = "(2[0-3]|[01][0-9]):[0-5][0-9]";
		 if(c.matches(pattern)) {

			 System.out.println("pattern matched");
			 return true; 
		 }
		         
		return false;
	}
    
	
	public static int validtime_count() {
		
		int count =0;
		for (String x : list) {
			if(regex_timestamp(x)) {
				count++;
			}
		}
		
		System.out.println("count is " + count);
		return count;
	}

	public static void main(String args[]) {  

		int[] numbers = {2, 9, 4, 3};  
		
		// getting permutations
		getPermutations(numbers);  
		//regex_timestamp(list.forEach(System.out::println));
		
		//getting count
		validtime_count();

	}

}

