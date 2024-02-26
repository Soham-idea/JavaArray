package practice;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapApp {
	public static void main(String[] args) {
		 
		 Scanner xyz  = new Scanner(System.in);
		 System.out.println("Enter data for search");
		 int key=xyz.nextInt();
			TreeMap hm = new TreeMap();
			hm.put(1,"ABC");
			hm.put(10,"PQR");
			hm.put(54,"STV");
			hm.put(20,"XYZ");
			hm.put(98,"RAM");
			hm.put(99, "OOOOO");
			hm.put(234,"STES");
		 Object obj = hm.get(key);
		 if(obj!=null) {
			 System.out.println("Data found "+obj);
		 }
		 else {
			 System.out.println("Data not found");
		 }
		}
	}








