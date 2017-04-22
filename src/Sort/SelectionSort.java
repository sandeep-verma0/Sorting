package Sort;

public class SelectionSort {

	/*
	 * Selection Sort The selection sort algorithm sorts an array by repeatedly
	 * finding the minimum element (considering ascending order) from unsorted
	 * part and putting it at the beginning. The algorithm maintains two
	 * subarrays in a given array.
	 * 
	 * 1) The subarray which is already sorted. 
	 * 2)Remaining subarray which is unsorted. In every iteration of selection
	 * 
	 * sort, the minimum element (considering ascending order) from the unsorted
	 * subarray is picked and moved to the sorted subarray.
	 */

	public void sort(int[] Arr) {
		int length = Arr.length;
        int min,minIndex;
		for(int i=0;i<length-1;i++){
			min=Arr[i];
			minIndex=i;
			for(int j=i+1;j<length;j++){
				if(Arr[j] < min)
				{
					min=Arr[j];
					minIndex=j;
				}
			}
			if(i!=minIndex)
			swap(Arr, i , minIndex);
		}
	}
	
	private void swap(int[] Arr, int i, int j){
		int temp=Arr[i];
		Arr[i]=Arr[j];
		Arr[j]=temp;
	}
}
