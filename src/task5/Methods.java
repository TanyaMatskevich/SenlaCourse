package task5;

public class Methods {
	static boolean isPalindrome(int i) {
		int a = i;
        int next = 0;

        while (a != 0) {
            next = (next * 10) + (a % 10);
            a /= 10;
        }

        return i == next;
    }
}

