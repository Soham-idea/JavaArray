package Vector;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class addition {
     public static void main(String[] args) {
    	 ArrayList al = new ArrayList();
 		al.add(100);
 		al.add(200);
 		al.add(300);
 		al.add(400);
 		al.add(500);
// 		v.add(600);
// 		v.add(700);
// 		v.add(800);
 		int sum = 0;
 		Vector v =  new Vector(al);//  vector collection_Constructor
 		 ListIterator i = al.listIterator();
// 		 while(i.hasNext()) {
// 			 Object obj = i.next();
// 			 sum = sum +(Integer) obj;
// 		 }
 		 for(Object obj : v) {
 			 sum = sum +(Integer) obj;
 		 }
 		 System.out.println(sum);
	}
     
}
