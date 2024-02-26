import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
//
//class EM implements Comparable<EM> {
//	private int id;
//	private String name;
//
//	public int getId() {
//		return id;
//	}
// 
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public EM(int id, String name) {
//		//super();
//		this.id = id;
//		this.name = name;
//	}
//
//	
//
//	@Override
//	public int compareTo(EM o) {
//		
//		
//		if(o.getName().compareTo(this.name)<0)
//		{
//			return 1;
//		}
//		else if(o.getName().compareTo(this.name)>0) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}
//
//}

public class t2 {
	public static void main(String[] args) {
		// Creating a TreeSet

		SortedSet s = new TreeSet();
		s.add("bca");
		s.add( "abc");
		TreeSet  hs = new TreeSet<>(s);

		for (Object obj: hs) {
			//System.out.println(em.getId() + "\t" + em.getName());
                    System.out.println(obj);
		}

		// SortedSet<Integer> sortedSet = new TreeSet<>( );
		// TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1,3,1,4,5));

//		for (Object obj : sortedSet) {
//			System.out.println(obj);
//		}

		// TreeSet treeSet = new TreeSet();
	}

}
