package task3;

import java.util.Arrays;

public class Methods {
	public static long doTask(String str) {
		return Arrays.stream(str.split(" "))
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .sorted()
                .peek(System.out::println)
                .count();
	}
}
