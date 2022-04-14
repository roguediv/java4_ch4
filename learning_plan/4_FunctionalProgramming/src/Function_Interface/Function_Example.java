package Function_Interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Function_Example {

	public static void main(String[] args) {
		// Function example
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();
		
		System.out.println(f1.apply("Hello World!"));
		
		// BiFunction
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 = (string, toAdd) ->
											string.concat(toAdd);
											
		System.out.println(b2.apply("Hello ", "World!"));

	}

}
