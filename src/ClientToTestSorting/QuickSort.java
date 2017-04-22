package ClientToTestSorting;

public class QuickSort {

	public void sort(int[] Arr , int low, int high){
		int i=low;
		int j=high;
		
		 // calculate pivot number, I am taking pivot as middle index number 
		int pivot = Arr[(low+((high-low)/2))];
		
		 // Divide into two arrays
		while(i <=j){
			
			 /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
			while(Arr[i]<pivot)
				i++;
			while(Arr[j]>pivot)
				j--;
			
			//Exchange in case left Arr has element greater than pivot and right has element less than pivot
			if(i<=j){
				int temp = Arr[i];
				Arr[i] = Arr[j];
				Arr[j] = temp;
				i++;
				j--;
			}	
		}
		
		//If either i or j doesn't reach to ends , we need to call recursively on part which is left to traverse
		if(low <j )
			sort(Arr , low , j);
		if(i< high)
			sort(Arr , i , high);
	}
}
