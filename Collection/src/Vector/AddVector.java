package Vector;

import java.util.*;
class Student{
	
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
public class AddVector {

	public static void main(String[] args) {
		
		Student s1 = new Student(21, "raj");
		Student s2 = new Student(43, "suraj");
		Student s3 = new Student(77, "Anil");
     	Vector v  =  new Vector();
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		for(Object O:v)
		{
				Student s = (Student)O;
				System.out.println(s.getId());
			
		}
		 Iterator i = v.iterator();
	
		 	while(i.hasNext())
		 	{
		 		System.out.println(i.next());
		 	}
	}

}
