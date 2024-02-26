package Vector;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class getMax {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);

		Vector v = new Vector(al);// vector collection_Constructor
		int max = (int) v.get(0);

		for (Object obj : v) {
			if ((Integer) obj > max) {
				max = (Integer) obj;
			}

		}
		System.out.println(max);
	}
     
}
