import java.util.*;
public class treeSet implements SortedSet {
	public static void main(String[] args) {
        // Creating a TreeSet
		SortedSet<Integer> sortedSet = new TreeSet<>(Arrays.asList(3, 1, 4, 1, 5));
		TreeSet<Integer> treeSet = new TreeSet<>(sortedSet);

	          for(Object obj: treeSet) {
	        	  System.out.println(obj);
	          }

       // TreeSet treeSet = new TreeSet();
}
}