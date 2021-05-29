package arrays;
import java.util.Arrays;

import strings.Solution;
public class codilityDemo {

	    public static void main(String[] args) {
			
	   int[] A = {1, 3, 6, 4, 1, 2};
	     System.out.println(solution(A));
		}
	    public static int solution(int[] A) {
	        Arrays.sort(A);     
	        int min = 1; 
	        int cap = A.length; //for efficiency — no need to calculate or access the array object’s length property per iteration 
	        
	        for (int i = 0; i < cap; i++){
	            if(A[i] == min){
	                min++;
	            }//can add else if A[i] > min, break
	        }   
	        //min = ( min <= 0 ) ? 1:min; //this means: if (min <= 0 ){min =1}else{min = min} you can also do: if min <1 for better efficiency/less jumps
	        return min;    
	    }
	}

