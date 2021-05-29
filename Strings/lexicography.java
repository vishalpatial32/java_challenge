package strings;

import java.util.*;

class GFG{
 
// Function to print the desired
// lexicographic smaller String
public static String findSmallestString(String str1,String str2)
{
    int []freq1 = new int[26];
    int []freq2 = new int[26];
    Arrays.fill(freq1, 0);
    Arrays.fill(freq2, 0);
 
    // Calculate length of the String
    int n1 = str1.length();
    int n2 = str2.length();
 
    // Stores the frequencies of
    // characters of String str1
    for(int i = 0; i < n1; ++i) 
    {
        freq1[str1.charAt(i) - 'a']++;
    }
 
    // Stores the frequencies of
    // characters of String str2
    for(int i = 0; i < n2; ++i)
    {
        freq2[str2.charAt(i) - 'a']++;
    }
 
    // Decrease the frequency of
    // second String from that of
    // of the first String
    for(int i = 0; i < 26; ++i)
    {
        freq1[i] -= freq2[i];
    }
 
    // To store the resultant String
    String res = "";
 
    // To find the index of first
    // character of the String str2
    int minIndex = str2.charAt(0) - 'a';
 
    // Append the characters in
    // lexicographical order
    for(int i = 0; i < 26; ++i)
    {
 
        // Append all the current
        // character (i + 'a')
        for(int j = 0; j < freq1[i]; ++j)
        {
            res += (char)(i + 'a');
        }
 
        // If we reach first character
        // of String str2 append str2
        if (i == minIndex) 
        {
            res += str2;
        }
    }
 
    // Return the resultant String
    return res;
}


 
// Driver Code
public static void main(String[] args)
{
    String str1 = "geeksforgeeksfor";
    String str2 = "for";
     
    String str3=findSmallestString(str1, str2);
    
    System.out.println(str3);
    //System.out.print(findSmallestString(str1, str2));
}
}