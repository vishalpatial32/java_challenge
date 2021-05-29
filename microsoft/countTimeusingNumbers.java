package microsoft;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class countTimeusingNumbers {
	

	    public static void main(String[] args)
	    {
	        int maxLimits[] = {2, 3, 5, 9};

	        ArrayList<Integer> list = new ArrayList<>();    
	        list.add(3);
	        list.add(2);
	        list.add(9);
	        list.add(2);

	        Collections.sort(list);
	        for (Integer integer : list) {
				System.out.println(integer);
			}
	        
	        int time[] = new int[4];

	        for(int i = 0; i<4; i++)
	        {
	            int index = 0;
	            for(int j=0; j<list.size(); j++)
	            {

	                if (list.get(j) <= maxLimits[i]) 
	                {
	                    time[i] = list.get(j);
	                    index = j;
	                }
	            }

	            list.remove(index);
	        }
	    }
	}


