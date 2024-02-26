package ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MethodRemove {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.remove(1);

		ListIterator i = al.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}
}
