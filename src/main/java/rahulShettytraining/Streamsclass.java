package rahulShettytraining;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Streamsclass {

	private static final Collection String = null;

	
	@Test
	public void normal()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shiva");
		names.add("Shakthi");
		names.add("Raja");
		names.add("Krishna");
		names.add("Vinayaga");
		names.add("Muruga");
		names.add("Saravana");
		names.add("Shiva");
		int count=0;
		
	for(int i=0;i<names.size();i++)
	{
		String actual =names.get(i);
		if(actual.endsWith("a"))
		{
			System.out.println(actual);
			count++;
		}
	}
	
		System.out.println(count);
		
	}



		
		@Test
		public void streamiterator()
		{
			ArrayList<String> names = new ArrayList<String>();
			
			names.add("Shiva");
			names.add("Shakthi");
			names.add("Raja");
			names.add("Krishna");
			names.add("Vinayaga");
			names.add("Muruga");
			names.add("Saravana");
			names.add("Siva");
			
			long a = names.stream().filter(s->s.endsWith("a")).count();
			System.out.println(names);
			System.out.println(a);
			
			
			long d = Stream.of("Shiva", "Shakthi", "Raja", "Krishna", "Vinayaga", "Muruga", "Saravana", "Siva").filter(s-> s.startsWith("S")).count();
			
			System.out.println(d);
			
		}
		
	
	
		@Test
		public void streammap()
		{
			List<String> names = Arrays.asList("Shiva", "Shakthi", "Raja", "Krishna", "Vinayaga", "Muruga", "Saravana", "Siva");
			names.stream().filter(s->s.startsWith("S")).map(s->s.toLowerCase()).forEach(s->System.out.println(s));
			
		}
		
		
	
	
		@Test
		public void mergeArrays()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Govind");
			names.add("Ganapathy");
			names.add("Kannan");
			names.add("Sami");
			names.add("Venky");
			
			List<String> names1 = Arrays.asList("Shiva", "Shakthi", "Raja", "Krishna", "Vinayaga", "Muruga", "Saravana", "Siva");
			Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
			//newStream.map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Shiva"));
			System.out.println(flag);
			Assert.assertTrue(flag);	
			
		}
		
	
		@Test
		public void uniqueNumbers()
		{
			List<Integer> ls = Arrays.asList(3,2,2,7,5,1,9,7);
			//ls.stream().distinct().forEach(s->System.out.println(s));
			List<Integer> values = ls.stream().distinct().sorted().collect(Collectors.toList());
			System.out.println(values.get(3));
			
			
			
		}
		
}




