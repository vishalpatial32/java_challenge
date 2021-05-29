  
package microsoft;

import java.util.*;
  
public class PasswordValidator {
  

	 
    // Function to return the count of
    // identical times the clock shows
    static int countIdentical(int hours, int minutes)
    {
 
        // To store the count of identical times
        // Initialized to 1 because of 0:0
        int i, count = 1;
 
        // For single digit hour
        for (i = 1; i <= 9 && i < hours; i++) {
 
            // Single digit minute
            if (i < minutes) {
                count++;
            }
 
            // Double digit minutes
            if ((i * 10 + i) < minutes) {
                count++;
            }
        }
 
        // For double digit hours
        for (i = 11; i <= 99 && i < hours; i = i + 11) {
 
            // Double digit minutes
            if (i < minutes) {
                count++;
            }
 
            // Single digit minute
            if ((i % 10) < minutes) {
                count++;
            }
        }
 
        // Return the required count
        return count;
    }
 
    // Driver code
    public static void main(String[] args) 
    {
    	int A=1;
    	int B=2;
    	int C=3;
    	int D=4;
    	
    	//print combinations of number in HH:MM format
    	combinations(A,B,C,D);
        int hours = 24;
        int minutes = 60;
       
      
        // Function Call
        System.out.println(countIdentical(hours, minutes));
    }

	private static void combinations(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		
		
		
	}
}