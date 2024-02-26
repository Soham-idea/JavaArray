import java.util.Comparator;
public class SortPlayerById implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Player p1 = (Player) o1;
		Player p2 = (Player) o2;
		if (p1.getId() > p2.getId()) {
			return 1;
		} else if (p1.getId() < p2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}


import java.util.*;
public class treecomp {
	public static void main(String[] args) {
		SortPlayerById si = new SortPlayerById();
		  TreeSet hs = new TreeSet(si);
                hs.add(new Player("ABC", 1, 5000));
		hs.add(new Player("MNO", 3, 2000));
		hs.add(new Player("PQR", 2, 4000));
		hs.add(new Player("STV", 4, 6000));
		for(Object obj:hs) {
			Player p=(Player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
	}
}
