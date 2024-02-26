package linkedlist;

import java.util.LinkedList;

public class occerence {
	
	 public static void main(String[] args) {
		    
		 LinkedList li = new  LinkedList();
		 
		  li.add(10);
		  li.add(20);
		  li.add(30);
		  li.add(30);
		  li.add(10);
		  li.add(40);
		  li.add(50);
		  li.add(40);
		  
		  for (int i=0 ; i<li.size(); i++) {
			  int count=1;
		  
			  for(int j=i+1 ; j<li.size(); j++) {
			         if(li.get(i)==li.get(j)) {
			        	 count++;
			        	li.remove(j);
			        //	j--;
			         }
			         }
			  System.out.println(li.get(i)+"="+count);
		}
		 
	}
	 
}
