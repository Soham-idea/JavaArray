package ArrayList1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratoeMethods {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        // Add elements to the ArrayList

      
        al.add(100);
		al.add(100);
		al.add(300);
		al.add(400);
		  ListIterator i = al.listIterator(al.size());
		  
		  while (i.hasPrevious()) {
	           // System.out.println(i.previous());
			  Object obj = i.previous();
			  System.out.println(obj);
			  }
//		  int count =0;
//        for(int a=0; a<al.size(); a++) {
//        	for(int b=0; b<al.size(); b++) {
//        		if(al.get(a)==al.get(b)) {
//        			System.out.println(count++);
//        		}
//        	}
   //     }
    }
}
