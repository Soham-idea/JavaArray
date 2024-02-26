package Vector;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_collectionConstructor {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
//		v.add(600);
//		v.add(700);
//		v.add(800);
		Vector v =  new Vector(al);// collection_Constructor 
		System.out.println("Vector " + v);      // use to copy one constructor into another
		System.out.println("Size : "+v.capacity());

	}

}
