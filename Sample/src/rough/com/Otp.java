package rough.com;

import java.util.ArrayList;
import java.util.Collections;

public class Otp {

	public static void main(String[] args) {
		ArrayList<Student> al= new ArrayList<Student>();

		al.add(new Student("rohan", 15));
		al.add(new Student("raghav", 10));
		Collections.sort(al);
		System.out.println(al);
	}

}
class Student implements Comparable<Student>{
	String name;
	int id;
	public Student(String name, int id) {
		this.name= name;
		this.id= id;
	}
	public String toString() {
		return name+" "+id;
	}
	public int compareTo(Student ob) {
		if(this.name.compareTo(ob.name)>1)
			return 1;
		else if(this.name.compareTo(ob.name)<1)
			return -1;
		else
			return 0;
	}
}

