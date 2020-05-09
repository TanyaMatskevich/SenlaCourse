package task6;

/*
 * Имеется набор вещей, которые необходимо поместить 
 * в рюкзак. Рюкзак обладает заданной грузоподъемностью. 
 * Вещи в свою очередь обладают двумя параметрами — весом 
 * и стоимостью. Цель задачи заполнить рюкзак не превысив 
 * его грузоподъемность и максимизировать суммарную 
 * ценность груза.
 */

public class Backpack {
	static final int MAX_WEIGHT = 80;

	static Items[] items = { new Items(10, 10), new Items(20, 60), new Items(50, 20) };

	public static void main(String[] args) {

		System.out.print("Total cost of items in a backpack: ");
		System.out.println(findOptCap(items.length - 1, MAX_WEIGHT));
	}

	private static int findOptCap(int i, int weigth) {

		if (i < 0) {
			return 0;
		}
		if (items[i].getWeight() > weigth) {
			return findOptCap(i - 1, weigth);
		} else {
			return Math.max(findOptCap(i - 1, weigth),
					findOptCap(i - 1, weigth - items[i].getWeight()) + items[i].getValue());
		}
	}
}
