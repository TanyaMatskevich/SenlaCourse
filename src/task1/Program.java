package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Создать программу, которая будет сообщать, 
 * является ли целое число, введенное пользователем, 
 * чётным или нечётным, простым или составным.  
 * Если пользователь введёт не целое число, то 
 * сообщать ему об ошибке.
 */

public class Program {
	public static void main(String[] args) {

		System.out.println("Enter an integer number: ");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(buf.readLine());
			printAnswer(a);
		} catch (NumberFormatException | IOException e) {
			System.out.println("The number is not an integer.");
		}

	}

	public static void printAnswer(int i) {
		System.out.printf("%d is %s and %s.", i, Number.isSimple(i) ? "simple" : "composite",
				Number.isEven(i) ? "even" : "odd");
	}
}
