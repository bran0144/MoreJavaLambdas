package org.paumard.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdas {

	public static void main(String[] args) {

		// Supplier
//		Use {} for multiple lines of code
//		{} are optional if you only have one short line of code
//		if you use {} you must include a return statement if your interface requires it
//		i.e. Supplier requires a return, Consumer does not
 		Supplier<String> supplier = () -> {

			System.out.println("I am inside the Supplier");
			return "Hello!"; 
		};

//		Invocation of supplier Lambda expression
//		Supplier has a get method
		String string = supplier.get();
		System.out.println("string = " + string);

		Consumer<String> consumer = 
				(String s) -> {
					System.out.println("I am inside the Consumer");
					System.out.println(s);
				};

//		Consumer has an accept method
		consumer.accept("Hello");
		
	}

}
/*
Notes:
A Lambda Expression implements a functional interface
NOT another way of writing instances of anonymous classes
Definition of functional interface- interface that has only one abstract method
Default and static methods do not count
Methods from Object do not count (so inherited Object methods are okay)
MAY be annotated that this is functional interface, but does not need to be (will help with catching errors
at compile time)

Example:
public interface Supplier<T> {
	T get():
}

Supplier<String> supplier = () -> "Hello!";

() = parameters
-> = lambda notation
"Hello" = implementation
 */