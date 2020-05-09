package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Создать программу, которая будет:
* подсчитывать количество слов в предложении
* выводить их в отсортированном виде 
* делать первую букву каждого слова заглавной. 
* Предложение вводится вручную. (Разделитель пробел (“ ”)).
*/

public class Program {

	public static void main(String[] args) {

		System.out.println("Enter sentence: ");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		String text = null;

		try {
			text = buf.readLine();
		} catch (IOException e) {
			System.out.println("Exception! Enter another sentence!");
		}
		System.out.println("Amount of words is " + Methods.doTask(text));

	}

}