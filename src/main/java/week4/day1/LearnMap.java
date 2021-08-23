package week4.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> obj = new HashMap<String, Integer> ();
		
		obj.put("siva", 12345);
		obj.put("magesh", 67890);
		obj.put("raj", 21314);
		
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		//System.out.println(obj);
		System.out.println(obj.remove("siva"));
		System.out.println(obj);
		System.out.println(obj.put("Boss", 22223333));
		System.out.println(obj);
		
		for (Entry<String, Integer> eachObj : obj.entrySet()) {
			
			System.out.println(eachObj.getKey()+"---->"+eachObj.getValue());
		}
		
		System.out.println(obj.containsKey("Boss"));
		System.out.println(obj.get("magesh"));
		
	}
	

}
