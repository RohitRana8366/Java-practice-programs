
import java.lang.*;

public class SortNames {

	static String name[] = { "Bombay", "Madras", "Delhi", "Pune", "Jaipur" };

	public static void main(String[] args) {

		System.out.println("Sorting Names using array by Er. Ram Babu Buri");

		int size = name.length;

		String temp = null;

		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {

				if (name[j].compareTo(name[i]) < 0) {

					temp = name[i];

					name[i] = name[j];

					name[j] = temp;

				}

			}

		}

		System.out.println("After Sorted Cities Name are: -");

		for (int i = 0; i < size; i++) {

			System.out.println(name[i]);

		}
	}
}