package Predicate_Example;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
	
		// BiPredicate Example
		BiPredicate<String, String> comparison = (string, prefix) ->
													string.startsWith(prefix);
													
		System.out.println(comparison.test("Hello World", "Hello"));											

	}
	
	// Predicate Example
	public static void doSomething(String value) {
			
		Predicate<String> comparison1 = String::isEmpty;
		Predicate<String> comparison2 = x -> x.isEmpty();
		
		// Old method
		if(value.isEmpty()) {
			throw new IllegalArgumentException(value);
		}
		
		// New method
		if(comparison1.test(value)) {
			throw new IllegalArgumentException(value);
		}
		
		// Do something
	}

}
