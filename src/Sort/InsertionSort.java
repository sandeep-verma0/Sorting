package Sort;

public class InsertionSort {

	/*
	 * Sort an arr[] of size n insertionSort(arr, n) Loop from
	 * i = 1 to n-1. ……a) Pick element arr[i] and insert it into sorted sequence
	 * arr[0…i-1]
	 */
	public void sort(int[] Arr) {

		int lenght = Arr.length;

		for (int i = 1; i < lenght; i++) {
			for (int j = i; j > 0; j--) {
				if (Arr[j] < Arr[j - 1]) {
					swap(Arr, j, j - 1);
					continue;
				} else {
					break;
				}
			}
		}
	}

	private void swap(int[] Arr, int i, int j) {
		int temp = Arr[i];
		Arr[i] = Arr[j];
		Arr[j] = temp;
	}
}
