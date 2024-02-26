package ArrayList1;

import java.util.ArrayList;

public class MethodGET {
   public static void main(String[] args) {
	   ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		
	//	System.out.println(al.get(1));
		Object obj = al.get(2);
		if(obj!=null) {
			System.out.println("not null");
		}else {
			System.out.println("Null");
		}
}
}
