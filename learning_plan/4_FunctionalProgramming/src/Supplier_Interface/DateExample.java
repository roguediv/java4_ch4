package Supplier_Interface;

import java.time.LocalDate;
import java.util.function.Supplier;

public class DateExample {

	public static void main(String[] args) {
		Supplier<LocalDate> firstDate = LocalDate::now;
		Supplier<LocalDate> secondDate = () -> LocalDate.now();
		
		// Old method
		LocalDate oldDate = LocalDate.now();
		
		LocalDate d1 = firstDate.get();
		LocalDate d2 = secondDate.get();
		
		System.out.println(d1);
		System.out.println(d2);

	}

}
