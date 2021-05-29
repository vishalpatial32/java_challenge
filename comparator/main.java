package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
	
	    public static void main(String[] args) {
			
	    	List<Student> student = new ArrayList<>();
			student.add(new Student(12,"aman"));
			student.add(new Student(98,"Ram"));
			student.add(new Student(99,"Shyam"));
			student.add(new Student(40,"tony"));
			
			//before sorting
			student.forEach(System.out::println);
            System.out.println("\n");
			//sorting
			//Collections.sort(student);
			Collections.sort(student,new sortbyNameThenMarks());
			//after sorting
			student.forEach(System.out::println);	
		
		}
		// TODO Auto-generated constructor stub
		
		
	}


class sortbyNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.name.equals(o2.name)) 
			return o1.marks - o2.marks;
		else
			return o2.marks - o1.marks;
	}
	
}
	
