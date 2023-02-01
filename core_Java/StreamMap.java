package core_Java;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To sort the stream and print it in UPPERCASE
		Stream.of("Tanmay","Tanishka","Vitthal","Sunil","Shankar","Revati","Rekha").filter(s->
		s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		
		//Merge two different lists
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Sun");
		names1.add("Bun");
		names1.add("Gun");
		
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Cat");
		names2.add("Bat");
		names2.add("Rat");
		
		Stream<String> mergedStream = Stream.concat(names1.stream(), names2.stream());
		mergedStream.sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
	
		
		
	}

}
