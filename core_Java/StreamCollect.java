package core_Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> collectedStream = Stream.of("Tanmay","Tanishka","Vitthal","Sunil","Shankar","Revati","Rekha").sorted().map(s
				->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(collectedStream.get(3));
		
		
		
		//Interview Quetion on streams
		
		List<Integer> values = Arrays.asList(4,4,2,7,8,9,1,0,5);
		//print the unique values
		// sort the array and print the third index
		values.stream().distinct().forEach(s->System.out.println(s));

		List<Integer> new1 =values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(new1.get(2));
	
	}

}
