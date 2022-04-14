package Consumer_Interface;

import java.time.LocalDate;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		// Consumer Example
		Consumer<String> firstConsumer = System.out::println;
		Consumer<String> secondConsumer = x -> System.out.println(x);
		
		firstConsumer.accept("Hello");
		secondConsumer.accept("World");
		
		// BiConsumer
		BiConsumer<LocalDate, String> logMessage = (LocalDate x, String y) ->
										System.out.println(x + " - " + y);
										
	    logMessage.accept(LocalDate.now(), "Entered function 3");								

	}

}
