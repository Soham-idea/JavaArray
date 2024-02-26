package Vector;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Sorting {
	Scanner sc = new Scanner(System.in);
	
	public void Sort(Vector v) {
		
		System.out.println("Befor sorting :");
		for(Object obj : v) {
			System.out.println(obj);
		}
		
		for(int i=0; i<v.size(); i++) {
			for(int j=i+1; j<v.size(); j++) {
				Object prevVal=v.get(i);
				Object nextVal=v.get(j);

				if((Integer)prevVal> (Integer)nextVal) {
					v.set(i, nextVal);
					v.set(j, prevVal);
				} 
			}
		}
		System.out.println("After sorting :");
		 Iterator i = v.iterator();
			
		 	while(i.hasNext())
		 	{
		 		System.out.println(i.next());
		 	}
		
	}

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(1500);
		v.add(50);
		v.add(500);
		
		Sorting sd = new Sorting();
		sd.Sort(v);
		
	}

}
