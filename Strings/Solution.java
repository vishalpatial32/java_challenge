package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
public class Solution {
    
    // Function to count frequency of
    // words in the given string
    static void count_freq(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();
 
        // Splitting to find the word
        String arr[]=str.split(" ");
 
        // Loop to iterate over the words
        for(int i=0;i<arr.length;i++)
        {
            // Condition to check if the 
            // array element is present 
            // the hash-map
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        
        //size of string
        System.out.println(arr.length);
        
        //list
        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

       
        // Loop to iterate over the 
        // elements of the map
        for(Map.Entry<String,Integer> entry: 
                    mp.entrySet())
        {
        	 list.add(entry.getValue());
        	/*System.out.println(entry.getKey()+
                    " - "+entry.getValue());*/
        }
        
        Collections.sort(list); 
        for (int num : list) {
            for (Entry<String, Integer> entry : mp.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        
        System.out.println(sortedMap);

    }
 
    // Driver Code
    public static void main(String[] args) {
        String str = "Geeks For Geeks";
        Scanner sc=new Scanner(System.in);
        
        String str1=sc.nextLine();
        System.out.println(str1);
        // Function Call
        count_freq(str1);
    }
}