package Comparator1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

class Player11   {
	private int id;
	private String name;
//	public Player1() {
//		
//	}
	public Player11(String name,int id,int run) {
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
	public String toString() {
		return "Player11 [id=" + id + ", name=" + name + ", run=" + run + "]";
	}
	 
}
 class SortById implements Comparator
{  @Override
	public int compare(Object o1, Object o2) {
		  Player11 p1=(Player11)o1;
		  Player11 p2=(Player11)o2;
		  if(p1.getId()>p2.getId()) {
			  return 1;
		  }
		  else if(p1.getId()<p2.getId()) {
			  return -1;
		  }
		  else {
		     return 0;
		  }
	}

}
 class SortByRun implements Comparator
 {  @Override
 	public int compare(Object o1, Object o2) {
 		  Player11 p1=(Player11)o1;
 		  Player11 p2=(Player11)o2;
 		  if(p1.getRun()>p2.getRun()) {
 			  return 1;
 		  }
 		  else if(p1.getRun()<p2.getRun()) {
 			  return -1;
 		  }
 		  else {
 		     return 0;
 		  }
 	}
 }
// class SortByName implements Comparator
// {  @Override
// 	public int compare(Object o1, Object o2) {
// 		  Player11 p1=(Player11)o1;
// 		  Player11 p2=(Player11)o2;
// 		  return p1.getName().compareTo(p2.getName());
// 	}
// }
 


public class Player1 {
	public static void main(String[] args) {
		 Player11 p1 = new Player11("Dam",4,10000);
		 Player11 p2 = new Player11("Bhyam",5,9000);
		 Player11 p3 = new Player11("Aanesh",3,11000);
		 Player11 p4 = new Player11("Eajesh",1,6000);
		 Player11 p5 = new Player11("Candeep",2,8000);
		 ArrayList<Player11> al = new ArrayList<Player11>();
		 al.add(p1);
		 al.add(p2);
		 al.add(p3);
		 al.add(p4);
		 al.add(p5);
		 
		 System.out.println("Before Sorting");
		 for(Object obj:al) {
			 Player11 p=(Player11)obj;
			 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		 }
		 SortById si = new SortById();
		 Collections.sort(al,si);// here we sort data by Id
		 System.out.println("Sort Player Data By Id");
		 for(Object obj:al) {
			 Player11 p=(Player11)obj;
			 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		 }
		 SortByRun sr = new SortByRun();
		 Collections.sort(al,sr);
		 System.out.println("Sort Player Data By Run");
		 for(Object obj:al) {
			 Player11 p=(Player11)obj;
			 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		 }
		// SortByName sn  = new SortByName();
//		 Collections.sort(al, new Comparator<Player11>() {
//			@Override
//			public int compare(Player11 o1, Player11 o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		});	
		al.sort((o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		 
		 
		 System.out.println("Sort Player Data By Name:");
		 for(Object obj:al) {
			 Player11 p=(Player11)obj;
			 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		 }
		 
		// here we sort data by name using lambda expression 
		 al.sort((o1,o2)-> o1.getName().compareTo(o2.getName()));
		 
		 al.forEach(o1-> System.out.println("Data:"+o1));
		 
		 
//		 System.out.println("Sort Player Data By Name: us");
//		 for(Object obj:al) {
//			 Player11 p=(Player11)obj;
//			 System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
//		 }
		
	}
}
