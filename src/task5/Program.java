package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Создать программу, которая в последовательности
 * от 0 до N, находит все числа-палиндромы (зеркальное
 * значение равно оригинальному). Длина последовательности 
 * N вводится вручную и не должна превышать 100.
 */

public class Program {

	static int MIN_VALUE = 0;
	static int MAX_VALUE = 100;

	public static void main(String[] args) {

		System.out.println("Enter N: ");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			n = Integer.parseInt(buf.readLine());

			if ((n < MIN_VALUE) || (n > MAX_VALUE)) {
				System.out.println("Warning! Your number must be between 0 and 100");
			} else {
				for (int i = MIN_VALUE; i < n + 1; i++) {
					if (Methods.isPalindrome(i)) {
						System.out.print(i + "  ");
					}
				}
			}

		} catch (NumberFormatException | IOException e) {
			System.out.println("Number format is wrong!");

		}

	}

}
