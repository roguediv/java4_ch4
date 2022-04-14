package Supplier_Interface;

import java.util.function.Supplier;

public class Dialog {
	
	private static String greetingMessage = "Hello, Welcome to my game!";

	public static void main(String[] args) {
		Supplier<String> dialogHelper = () -> greetingMessage;
		
		
		System.out.println(dialogHelper.get());

	}

}
