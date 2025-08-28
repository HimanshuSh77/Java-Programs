package Streams;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = { "Apple", "Mango", "Apple", "Orange", "Mango", "Papaya" };

		System.out.println(Arrays.stream(s).map(a -> a.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
	}

}
