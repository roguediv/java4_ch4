package Stream_Examples;

import java.util.stream.Stream;

public class StreamSources {

	public static void main(String[] args) {

		Stream<String> empty = Stream.empty(); // 0 Elements
		Stream<Integer> singleElement = Stream.of(1); // 1 Element
		
		Stream<Double> randomValue = Stream.generate(Math::random);
		
		System.out.println(randomValue.findFirst());
		
		Stream<Integer> oddValues = Stream.iterate(1, n -> n + 2);

		System.out.println(oddValues.count());
	}

}
