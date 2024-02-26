package Iterable1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class IterableRemove{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("how many elements you want to add");
		int no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			int element = sc.nextInt();
			al.add(element);
		}
		Iterator i = al.iterator();
		System.out.println("Data Before Remove");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		al.size();
		System.out.println("Size Before Remove : " + al.size());
		al.remove(3);
		i = al.iterator();
		System.out.println("Data After Remove");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("Size after Remove: " + al.size());
		boolean b = al.isEmpty();
		if (b) {
			System.out.println(" Empty");
		} else {
			System.out.println(" Not Empty");
		}
	}
} 