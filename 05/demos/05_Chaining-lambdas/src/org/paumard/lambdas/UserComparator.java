package org.paumard.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.paumard.lambdas.model.User;

public class UserComparator {

	public static void main(String[] args) {

		User sarah = new User("Sarah", 28);
		User james = new User("James", 35);
		User mary = new User("Mary", 33);
		User john1 = new User("John", 24);
		User john2 = new User("John", 25);
		
		List<User> users = Arrays.asList(sarah, james, mary, john1, john2);
		
		Comparator<User> cmpName = Comparator.comparing(user -> user.getName());
		Comparator<User> cmpAge = Comparator.comparing(user -> user.getAge());
		Comparator<User> comparator = cmpName.thenComparing(cmpAge);
		Comparator<User> reversed = comparator.reversed();
		
		users.sort(reversed);
		users.forEach(u -> System.out.println(u));
	}
}





