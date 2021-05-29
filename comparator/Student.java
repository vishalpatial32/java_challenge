package comparator;

public class Student implements Comparable<Student>{

 public Student(int marks, String name) {
		// TODO Auto-generated constructor stub
	  this.marks=marks;
	  this.name=name;
	}
/* public Student(int i, String string) {
		// TODO Auto-generated constructor stub
	  super();
	  this.marks=marks;
	  this.name=name;
	}*/
/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
  String name;
  int  marks;
  
  @Override
  public String toString() {
	  return "student \t" + this.name + " marks\t" + this.marks;
  }
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	if(this.marks <  o.marks)
		return -1;
	else if(this.marks > o.marks)
		return 1;
	return 0;
}
  
}
