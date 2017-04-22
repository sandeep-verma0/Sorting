package Sort;

public class BubbleSort {

	/* Bubble Sort is the simplest sorting algorithm that works by repeatedly
	 *  swapping the adjacent elements if they are in wrong order.*/
	public void sort(int[] Arr) {

		int length = Arr.length;
		boolean isSwappedAtleastOnce = false;
		for (int i = 0; i < length; i++) {
			
			for (int j = 0; j < length - i - 1; j++) {
				if (Arr[j] > Arr[j + 1]) {
					swap(Arr, j, j + 1);
					isSwappedAtleastOnce = true;
				}
			}
			
			if (!isSwappedAtleastOnce)
				return;
			else
				isSwappedAtleastOnce = false;
		}
	}

	private void swap(int[] Arr, int i, int j) {
		int temp = Arr[i];
		Arr[i] = Arr[j];
		Arr[j] = temp;
	}
}
