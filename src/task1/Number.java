package task1;

public class Number {

	static boolean isEven(int num) {
		return num % 2 == 0;
	}

	static boolean isSimple(int num) {
		if (isEven(num)) {
			return num == 2;
		}

		for (int i = 2; i <= num / 2; i++) {
			int ost = num % i;
			if (ost == 0) {
				return false;
			}
		}
		return true;
	}

}