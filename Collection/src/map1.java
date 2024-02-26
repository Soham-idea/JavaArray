import java.util.LinkedHashMap;

public class map1 {
       
public static void main(String[] args) {
	LinkedHashMap lp = new LinkedHashMap();
Object v1=	lp.put(1, "asd"); 

Object v2=lp.put(2, "pqr");

Object v3=lp.put(2, "mno");
	System.out.println(lp.put(4, "vbn"));
	System.out.println(v1);
	System.out.println(v3);
System.out.println(lp);

}

}
