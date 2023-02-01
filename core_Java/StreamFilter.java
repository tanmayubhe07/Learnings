package core_Java;

import java.util.ArrayList;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();

		names.add("Tanmay");
		names.add("Tanishka");
		names.add("Rekha");
		names.add("Sunil");
		names.add("Vitthal");
		names.add("Shankar");
		names.add("Revati");
		names.add("Gatha");

		// To print all names in data structure
		names.stream().filter(s -> true).forEach(s -> System.out.println(s));

		// To print name starting with letter T

		System.out.println(names.stream().filter(s -> s.startsWith("T")).count());

		// To print name which has length < 6

		names.stream().filter(s -> s.length() < 6).forEach(s -> System.out.println(s));

	}

}
