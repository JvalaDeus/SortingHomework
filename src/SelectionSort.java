import java.util.Scanner;

public class SelectionSort {
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
		for (int i = 0; i < Array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[j] < Array[minIndex]) {
					minIndex = j;
				}
			}
			int temp = Array[minIndex];
			Array[minIndex] = Array[i];
			Array[i] = temp;
		}
		return Array;
	}

	public static void printArray(int[] Array) {

		for (int i : Array) {
			System.out.print(i + " ");

		}
	}

}
