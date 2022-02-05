package map;
import java.util.Hashtable;
import java.util.Map;
public class HashTable1 {

public static void main(String[] args) {
		
		Hashtable<Integer, String> a=new Hashtable<Integer, String>();
		
		a.put(4, "atharva");
		a.put(5, "ganesh");
		a.put(6, "tony");
		a.put(7, "user");
		
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
