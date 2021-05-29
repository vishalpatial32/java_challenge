package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

import comparator.main;


public class linkedlist1 {

	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		//getTimeDiff(ll);
		//getTimeDiff(al);
		
		MyLinkedList ml = new MyLinkedList();
		
		for (int i = 0; i < 10; i++) {
			ml.add(i);
		}
		
		ml.print();
	}
	
	 static void getTimeDiff(List<Integer> list) {
			
		 long starttime = System.currentTimeMillis();
		 
		 for (int i = 0; i < 1000000; i++) {
			list.add(0,i);
		}
		 
		 long endtime = System.currentTimeMillis();
		 
		 System.out.println("time taken" + list.getClass() + "--------->" + (endtime -starttime));
		}
	
   	
}
