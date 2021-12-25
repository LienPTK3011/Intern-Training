package StreamAPI;

import java.util.stream.IntStream;

public class sinceJava8 {

	public static void main(String[] args) {
		int sum = IntStream.of(28,-18,0,-28,9,18,72,18,54,-7)
				.distinct()
				.filter(num -> num % 18 == 0)
				.reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
