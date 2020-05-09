package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * Создать программу, которая подсчитывает сколько 
 * раз употребляется слово в тексте (без учета регистра). 
 * Текст и слово вводится вручную.
 */

public class Program {

	public static void main(String[] args) {

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String text = null;
		String word = null;
		try {
			System.out.println("Enter sentence: ");
			text = buf.readLine();
			System.out.println("Enter word: ");
			word = buf.readLine();
		} catch (IOException e) {
			System.out.println("Exception! Enter another sentence!");
		}
		long count = Arrays.stream(text.split(" ")).filter(word::equalsIgnoreCase).count();
		System.out.println("The word occurs in the string " + count + " times");

	}

}
