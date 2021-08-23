package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> pop = new ArrayList<>();
		pop.add("Siva");
		pop.add("Merwin");
		pop.add("Sathish");
		pop.add("Bala");
		pop.add("Siva");
		
		for (String name : pop) {
			if (name.startsWith("S")) {
				
				
			} else
		}
				
		
		/*for (int i = 0; i < pop.size(); i++) {
			pop.remove(i);
		}*/
		
		
		//pop.remove(0);
		for (String name1 : pop) {
			
			if (name1.startsWith("S")) {
				System.out.println(name1);
				
			} else if (name1.startsWith(name1)){
				
			}
			
		}
	*/	//System.out.println(pop.remove());
		
		System.out.println(pop);
	}

}
