package org.paumard.lambdas;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {

	public static void main(String[] args) {

		IntSupplier supplier = () -> 10;
		int i = supplier.getAsInt();
		System.out.println("i = " + i);
		
		DoubleToIntFunction function = value -> (int)Math.floor(value);
		int pi = function.applyAsInt(Math.PI);
		System.out.println("Pi = " + pi);
		
	}
}

/*
Lambdas are not instances of anonymous classes!
What can be written in a lambda can also be written in an anonymous class, but they are not the same thing.
The compiled code is very different. Lambdas used a specific kind of byte code called invokedynamic. Performance
is VERY different. (60x better)
Avoid autoboxing (automatic conversion from a primitive type to an Object).
Autounboxing(removes wrapper and returns primitive type).
Example:
Comparator<Integer> cmp = (i1, i2) -> Integer.compare(i1, i2);

int compared = cmp.compare(10, 20);
values here are passed in as primitive types, which means that the comparator (which takes an object), needs
to box them into Integer, and then unbox them to run the compared function as int (primitive type). This
comes at a cost. Be aware of this and choose another way of doing this.
Use java.util specific version (like IntPredicate, IntFunction<T>) that will not need to box and then unbox.
It takes in a primitive type.
 */
