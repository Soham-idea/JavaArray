package ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MethodsSet {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

		
		ListIterator i = al.listIterator();
		for(Object obj : al) {
			if(i.hasPrevious()==i.hasNext()) {
				System.out.println();
			}
		}
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		al.set(2, 100);
		i = al.listIterator();
		while (i.hasNext()) {
			System.out.println("After set value :"+i.next());
		}
	}
}
