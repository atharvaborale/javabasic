package map;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	
public static void main(String[] args) {
		
		HashMap<Integer, String> a=new HashMap<Integer, String>();
		
		a.put(4, "atharva");
		a.put(5, "ganesh");
		a.put(6, "tony");
		a.put(null,null);
		a.put(null, "omkar");
		a.put(8, null);
		
		System.out.println(a);
		System.out.println("get element "+a.get(5));
		a.remove(8);
		System.out.println(a);
		
		//iterate using for loop
		for(Map.Entry m :a.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
