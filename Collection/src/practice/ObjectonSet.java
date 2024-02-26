package practice;

import java.util.LinkedHashSet;

class comObjectset{
	   int id;
	    String name;
	    int sal;
	public comObjectset(String name,int id, int sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public boolean equals(Object obj) {
		comObjectset temp = (comObjectset) obj;
		if(temp.id == this.id && temp.name.equals(this.name) && temp.sal == this.sal ) {
			return true;
		}else {
			return false;
		}
    	}
	public int hashCode() {
		 return id*1000;
	}
	
	}

public class ObjectonSet {
	public static void main(String[] args) {
		comObjectset co1 = new comObjectset("ram", 1, 1000);
		comObjectset co2 = new comObjectset("sham", 2, 1000);
		comObjectset co3 = new comObjectset("ram", 1, 1000);
		comObjectset co4 = new comObjectset("sham", 2, 1000);
		comObjectset co5 = new comObjectset("ram", 1, 1000);
		comObjectset co6 = new comObjectset("raj", 4, 1000);
		LinkedHashSet hs = new  LinkedHashSet();
		  hs.add(co1);
		  hs.add(co2);
		  hs.add(co3);
		  hs.add(co4);
		  hs.add(co5);
		  hs.add(co6);
		  
		  for(Object obj :hs) 
		  {
			 comObjectset cs = (comObjectset)obj;
			  System.out.println(cs.name+"\t"+cs.id+"\t"+cs.sal);
		  }
	}
    
}
