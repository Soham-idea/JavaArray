package Vector;

import java.util.Vector;

public class Inital_Constructor {

	public static void main(String[] args) {
		Vector v = new Vector(5);//incremental constructor
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
     //	v.add(600);
//		v.add(700);
//		v.add(800);
		System.out.println(v);
		System.out.println("Size : "+v.capacity());

	}

}
