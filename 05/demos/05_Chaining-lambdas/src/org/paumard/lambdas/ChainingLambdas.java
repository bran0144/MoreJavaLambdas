package org.paumard.lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {

	public static void main(String[] args) {

		Consumer<String> c1 = s -> System.out.println("c1 consumes " + s);
		Consumer<String> c2 = s -> System.out.println("c2 consumes " + s);

//		longer version
		Consumer<String> c3 = s -> {
			c1.accept(s);
			c2.accept(s);};
		c3.accept("hello");

//		shorter version (andThen is a default method for Consumer)
		Consumer<String> c4 = c1.andThen(c2);
		c4.accept("Hello");
		
		Predicate<String> isNull = s -> s == null;
		System.out.println("For null = " + isNull.test(null));
		System.out.println("For Hello = " + isNull.test("Hello"));
		
		Predicate<String> isEmpty = s -> s.isEmpty();
		System.out.println("For empty = " + isEmpty.test(""));
		System.out.println("For Hello = " + isEmpty.test("Hello"));

//		Predicate has a negate default method (which is similar to !)
//		and is another default method for Predicate
		Predicate<String> p = isNull.negate().and(isEmpty.negate());
		System.out.println("For null = " + p.test(null));
		System.out.println("For empty = " + p.test(""));
		System.out.println("For Hello = " + p.test("Hello"));
	}
}
/*
Notes:
Lambdas allow for more functional programming in Java (an OOP language).
Default methods give you the ability to chain lambdas.
Predicate has (and, negate, or, isEqual, and not) default methods.
 */







