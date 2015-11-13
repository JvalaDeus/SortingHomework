import java.util.Scanner;

public class InsertionSort {
	private static int[] Array;

	public static void main(String[] args) {
		Array = getArray();
		sort(Array);
		printArray(Array);
	}

	public static int[] getArray() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		int item = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("please enter the " + i + "th number to be sorted.");
			item = scanner.nextInt();
			array[i] = item;
		}
		return array;
	}

	public static int[] sort(int[] Array) {
		for (int i = 1; i < Array.length; i++) {
			int startPt = Array[i];
			int j = i - 1;

			while (j >= 0 && Array[j] > startPt) {
				Array[j + 1] = Array[j];
				j--;
			}
			Array[j + 1] = startPt;
		}
		return Array;
	}

	public static void printArray(int[] Array) {

		for (int i : Array) {
			System.out.print(i + " ");

		}
	}
}
