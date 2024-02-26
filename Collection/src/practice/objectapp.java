package practice;

   class comObject{
	   private int id;
	   private String name;
	   private int sal;
	public comObject(String name,int id, int sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public boolean equals(Object obj) {
		comObject temp = (comObject) obj;
		if(temp.id == this.id && temp.name.equals(this.name) && temp.sal == this.sal ) {
			return true;
		}else {
			return false;
		}
    	}
	public int hashcode() {
		 return id*1000;
	}
	
	}

public class objectapp {
	public static void main(String[] args) {
		comObject co1 = new comObject("ram", 1, 1000);
		comObject co2 = new comObject("ram", 2, 1000);
		if (co1.equals(co2)) {
			System.out.println("Objects are equals");
			System.out.println("jvm hashcode of co1 : "+System.identityHashCode(co1));
			System.out.println("jvm hashcode of co2 : "+System.identityHashCode(co2));
			System.out.println("User hashcode of co1 :" +co1.hashcode());
			System.out.println("User hashcode of co2 : "+co2.hashcode());
			
		} else {
			System.out.println("Objects  not are equals");
			System.out.println("jvm hashcode of co1 : "+System.identityHashCode(co1));
			System.out.println("jvm hashcode of co2 : "+System.identityHashCode(co2));
			System.out.println("User hashcode of co1 :" +co1.hashcode());
			System.out.println("User hashcode of co2 : "+co2.hashcode());
			
			}
	}
    
}
