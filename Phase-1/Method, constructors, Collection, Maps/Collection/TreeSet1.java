package Collection;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	
public static void main(String[] args) {
		
		//ref variable
		Set<String> c=new TreeSet<String>();
		
		c.add("apple");
		c.add("banana");
		//set.add(null);// null not allowed in TreeSet
		c.add("banana");
		c.add("cherry");
		c.add("almond");
		
		System.out.println("Size: "+c.size());
		System.out.println(c);
		
		System.out.println("Contains "+c.contains("cherry"));
		
		System.out.println(c);
		

}

}