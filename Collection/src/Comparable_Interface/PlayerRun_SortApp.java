package Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;

class Player implements Comparable  {
	private int id;
	private String name;
//	public Player() {
//		
//	}
	public Player(String name,int id,int run) {
		this.name=name;
		this.id=id;
		this.run=run;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	private int run;
	@Override
	public int compareTo(Object o) {
		 Player p=(Player)o;
		 if(this.run>p.run) {
			 return 1;
		 }
		 else if(this.run<p.run) {
			 return -1;
		 }
		 else {
		   return 0;
		 }
	}
}

public class PlayerRun_SortApp {
	public static void main(String[] args) {
		 Player p1 = new Player("Ram",1,10000);
		 Player p2 = new Player("Shyam",2,9000);
		 Player p3 = new Player("Ganesh",3,11000);
		 Player p4 = new Player("Rajesh",4,6000);
		 Player p5 = new Player("Sandeep",5,8000);
		 ArrayList al = new ArrayList();
		 al.add(p1);
		 al.add(p2);
		 al.add(p3);
		 al.add(p4);
		 al.add(p5);
		 System.out.println("Before Sorting");
		 for(Object obj:al) {
			 Player p=(Player)obj;
			 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		 }
		 Collections.sort(al);
		 System.out.println("After Sorting");
		 for(Object obj:al) {
			 Player p=(Player)obj;
			 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		 }
	}
}


