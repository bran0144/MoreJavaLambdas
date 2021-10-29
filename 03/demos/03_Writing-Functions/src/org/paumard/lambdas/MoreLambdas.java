package org.paumard.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambdas {

	public static void main(String[] args) {

		List<String> strings = 
				new ArrayList<>(List.of("one", "two", "three", "four", "five"));
		
		strings.removeIf(string -> !string.startsWith("t"));
		strings.forEach(string -> System.out.println(string));
	}
}

/*
Notes:
java.util.function  - this is the standard toolbox of functional interfaces
There are more than 40 interfaces organized into four categories
-Suppliers - does not take in any arguments, returns something of type T (to be defined when you define
  your supplier), and has a get method
  - public interface Supplier<T> { T get(); }
  - Supplier<String> supplier = () -> "Hello!";
-Consumers - takes in something of type T (to be defined when you define your consumer), returns nothing (void),
	and has an accept method
	- public interface Consumer<T> { void accept(T t); }
	- Consumer<String> consumer = s -> System.out.println(s);
-Predicates * most important - takes any kind of object (must give it a parameter), does some kind of testing on it,
	and returns a boolean. Used in the filtering operations of the streaming API.
	- public interface Predicate<T> { boolean test(T t); }
	- Predicate<String> isEmpty = s -> s.isEmpty();
-Functions * most important - takes any kind of object (must give it a parameter) (T type), returns another kind
	of object (R). Used in teh map operation of the streaming API.
	- public interface Function<T, R> { R apply(T t);}
	- Function<User, String> getName = user -> user.getName();
-Runnable - single abstract method, run. Does not take in anything and does not return anything
	- public interface Runnable { void run();}
	- Runnable alert = () -> System.out.println("I am Groot");






 */