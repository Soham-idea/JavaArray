package Vector;

import java.util.Scanner;
import java.util.Vector;

public class All_Operation {
	Scanner sc =  new Scanner (System.in);
	public void operationVector(Vector v ) {
		
		do {
			System.out.println("1. Add new element in Vector ");
			System.out.println("2. View All Elements from Vector");
			System.out.println("3. Search element from vector");
			System.out.println("4. Delete element from vector");
			System.out.println("5. Find the size of vector.");
			System.out.println("6. Replace element on specified index.");
			System.out.println("7. Exit.");
			 System.out.println("Enter the choice ");
			   int choice = sc.nextInt();
			
			switch( choice) {
			
			case 1:{
				   System.out.println("Enter the Element");
				   int no = sc.nextInt();
				   v.add(no);
				break;
			}
			
			case 2:{
				 for(Object obj : v ) {
				    	System.out.println(obj);
				    }
				break;
			}
			case 3:{
				 System.out.println("Enter the Value to Search");
				 int Search = sc.nextInt();
			   boolean b = v.contains(Search);
				 if(b) {
					 System.out.println(" Data found");
				 }else {
					 System.out.println(" Data Not Found");
				 }
				break;
			}
			case 4:{
				 System.out.println("Enter the Value to Search");
				 int value = sc.nextInt();
			          int index = v.indexOf(value);
				 if(index!=-1) {
			        v.remove(index);
					 System.out.println("Delete"); 
				 }else {
					 System.out.println("Not Delete");
				 }
				break;
			}
			case 5:{
			
					System.out.println("Size : "+  v.size());
				break;
			
			}
			case 6:{
				
				System.out.println("Enter the index and value");
			int index =sc.nextInt(); 
			int value =sc.nextInt(); 
				v.set(index, value);
				
				break;
				
			}
			case 7:{
				System.exit(0);
				System.out.println("you Exit Sucessfully");
			 break;
			}
			 default:
				 System.out.println("Wrong choice");
			}

			

		}while(true);
				
		   
	}
	
	
	

	
	

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
//		System.out.println("Enter the Choice ");
//int Choice = sc.nextInt();
	
		All_Operation All = new All_Operation();
		All.operationVector(v);

	}

}
