package Optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
	
		System.out.println(average(5,2,3,4,5,2,5,3,6,7));

	}
	
	// Variable passed in is a Variable Argument VarArg
	public static Optional<Double> average(int... scores){
		
		// Safe check
		if(scores.length == 0) {
			return Optional.empty();
		}
		
		int sum = 0;
		
		for(int score: scores) {
			sum += score;
		}
		
		return Optional.of((double) sum / scores.length);
	}

}
