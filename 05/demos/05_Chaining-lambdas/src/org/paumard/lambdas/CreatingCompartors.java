package org.paumard.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingCompartors {

	public static void main(String[] args) {

		List<String> strings = 
				Arrays.asList("one", "two", "three", "four", "five", 
						"six", "seven", "eight", "nine");
		
		Comparator<String> cmp = 
				(s1, s2) -> s1.compareTo(s2);
		strings.sort(cmp);
		System.out.println(strings);

//		Old way of comparing string length:
		Comparator<String> cmp2 =
				(s1, s2) -> Integer.compare(s1.length(), s2.length());
		strings.sort(cmp2);
		System.out.println(strings);

//		Better way (key extractor)
		ToIntFunction<String> toLength = s -> s.length();
		Comparator<String> cmp3 = Comparator.comparingInt(toLength);
				
		strings.sort(cmp3);
		System.out.println(strings);
	}
}
/*
Notes:
If you have two or more parameters, they must be in ().
sort() will sort the list in place.
Functional interfaces can have any number of default or static methods.


 */
