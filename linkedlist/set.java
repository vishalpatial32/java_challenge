package linkedlist;

import java.util.HashSet;
import java.util.Iterator;

public class set {

	public static void main(String[] args) {
		
		int a[]= {1,1,1,123,323,323,23,23,100,123,435,544,645,7,34,77,7,733};
		
		System.out.println(a.length);
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
			System.out.println(integer);
		}
	}
}
