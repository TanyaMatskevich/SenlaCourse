package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Создать программу, которая будет вычислять и выводить
 * на экран НОК (наименьшее общее кратное) и 
 * НОД (наибольший общий делитель) двух целых чисел, 
 * введенных пользователем. Если пользователь некорректно 
 * введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

public class Program {

	public static void main(String[] args) {
		System.out.println("Enter 2 integer numbers: ");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(buf.readLine());
			int b = Integer.parseInt(buf.readLine());
			System.out.println("Greatest Common Divisor(GCD) is " + Number.calculateGCD(a, b));
			System.out.println("Least Common Multiple(LCM) is " + Number.calculateLCM(a, b));
		} catch (NumberFormatException | IOException e) {
			System.out.println("Invalid input. The number is not an integer.");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero. The operation cannot be performed.");
		}

	}

}
