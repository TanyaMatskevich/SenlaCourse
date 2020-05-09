package task2;

public class Number {

	public static int calculateGCD(int a, int b) {
		return b == 0 ? a : calculateGCD(b, a % b);

	}

	public static int calculateLCM(int a, int b) {
		return a / calculateGCD(a, b) * b;
	}
}
