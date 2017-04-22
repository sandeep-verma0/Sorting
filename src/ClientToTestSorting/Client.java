package ClientToTestSorting;

import java.util.Comparator;

import Sort.BubbleSort;
import Sort.HeapSort;
import Sort.InsertionSort;
import Sort.MergeSort;
import Sort.RadixSort;
import Sort.SelectionSort;

public class Client implements Comparator<Integer> {

	public static void main(String[] args) {

		int numberOfElements = 10;

		int[] Arr = new int[numberOfElements];
		for (int i = 0; i < numberOfElements; i++)
			Arr[i] = (int)(numberOfElements*10 *  Math.random());

		Client cli = new Client();
		//cli.sortUsingSelectionSort(Arr);
		//cli.sortUsingInsertionSort(Arr);
		//cli.sortUsingBubbleSort(Arr);
		//cli.sortUsingMergeSort(Arr);
		//cli.sortUsingHeapSort(Arr);
		//cli.sortUsingQuickSort(Arr);
		cli.sortUsingRadixSort(Arr);
		
	}
	
	
	public void sortUsingRadixSort(int[] Arr){
		System.out.println("------------Before Sorting-------------------");
		for(int value : Arr)
			System.out.print(" " + value);
		System.out.println();
		
		RadixSort radixSort = new RadixSort();
		radixSort.sort(Arr ,  Arr.length);
		System.out.println("-------------After Sorting using Radix sort -----------");
		for(int value : Arr)
			System.out.print(" " + value);
		
		Client cli = new Client();
		System.out.println();
		System.out.println();
		System.out.println("Is Array Sorted : " +cli.isSorted(Arr));
	}
	
	
	public void sortUsingQuickSort(int[] Arr){
		System.out.println("------------Before Sorting-------------------");
		for(int value : Arr)
			System.out.print(" " + value);
		System.out.println();
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(Arr , 0 , Arr.length-1);
		System.out.println("-------------After Sorting using Quick sort -----------");
		for(int value : Arr)
			System.out.print(" " + value);
		
		Client cli = new Client();
		System.out.println();
		System.out.println();
		System.out.println("Is Array Sorted : " +cli.isSorted(Arr));
	}
	
	
	
	public void sortUsingHeapSort(int[] Arr){
		System.out.println("------------Before Sorting-------------------");
		for(int value : Arr)
			System.out.print(" " + value);
		System.out.println();
		
		HeapSort heapSort = new HeapSort();
		heapSort.sort(Arr);
		System.out.println("-------------After Sorting using Heapsort -----------");
		for(int value : Arr)
			System.out.print(" " + value);
		
		Client cli = new Client();
		System.out.println();
		System.out.println();
		System.out.println("Is Array Sorted : " +cli.isSorted(Arr));
	}


	public void sortUsingMergeSort(int[] Arr){
		System.out.println("------------Before Sorting-------------------");
		for(int value : Arr)
			System.out.print(" " + value);
		System.out.println();
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(Arr , 0 , Arr.length-1);
		System.out.println("-------------After Sorting using Merge sort -----------");
		for(int value : Arr)
			System.out.print(" " + value);
		
		Client cli = new Client();
		System.out.println();
		System.out.println();
		System.out.println("Is Array Sorted : " +cli.isSorted(Arr));
	}
	
	
	public void sortUsingBubbleSort(int[] Arr){
		System.out.println("------------Before Sorting-------------------");
		for(int value : Arr)
			System.out.print(" " + value);
		System.out.println();
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(Arr);
		System.out.println("-------------After Sorting using Bubble sort -----------");
		for(int value : Arr)
			System.out.print(" " + value);
		
		Client cli = new Client();
		System.out.println();
		System.out.println();
		System.out.println("Is Array Sorted : " +cli.isSorted(Arr));
	}
	
	
	public void sortUsingInsertionSort(int[] Arr){
		System.out.println("------------Before Sorting-------------------");
		for(int value : Arr)
			System.out.print(" " + value);
		System.out.println();
		
		InsertionSort insSort = new InsertionSort();
		insSort.sort(Arr);
		System.out.println("-------------After Sorting using Insertion sort -----------");
		for(int value : Arr)
			System.out.print(" " + value);
		
		Client cli = new Client();
		System.out.println();
		System.out.println();
		System.out.println("Is Array Sorted : " +cli.isSorted(Arr));
	}
	
	public void sortUsingSelectionSort(int[] Arr){
		System.out.println("------------Before Sorting-------------------");
		for(int value : Arr)
			System.out.print(" " + value);
		System.out.println();
		
		SelectionSort selSort = new SelectionSort();
		selSort.sort(Arr);
		System.out.println("-------------After Sorting using selection sort -----------");
		for(int value : Arr)
			System.out.print(" " + value);
		
		Client cli = new Client();
		System.out.println();
		System.out.println();
		System.out.println("Is Array Sorted : " +cli.isSorted(Arr));
	}
	
	public boolean isSorted(int[] Arr) {
		int size = Arr.length;

		for (int i = 0; i < size-1; i++) {
			int test = compare(Arr[i], Arr[i + 1]);
			if (test != 1)
				return false;
			else
				continue;
		}
		return true;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1.intValue() <= o2.intValue())
			return 1;
		else
			return -1;

	}

}
