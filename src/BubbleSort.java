import java.util.Scanner;

public class BubbleSort {

	private static int[] Array;

	public static void main(String[] args) {
		Array = getArray();
		printArray();
		sort();
		sort();
		System.out.println();
		printArray();
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

	public static void sort() {
		int first = 0;
		int second = Array.length - 1;

		bubbleSort(first, second);
	}

	private static void bubbleSort(int first, int second) {
		for (int i = second; i > 1; i--) {
			for (int j = first; j < i; j++) {
				if (Array[j] > Array[j + 1]) {
					swap(j, j + 1);
				}
			}
		}
	}

	public static void swap(int left, int right) {
		int temp = Array[left];
		Array[left] = Array[right];
		Array[right] = temp;
	}

	public static void printArray() {
		for (int i : Array) {
			System.out.print(i + " ");
		}
	}

}