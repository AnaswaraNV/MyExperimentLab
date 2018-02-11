import java.util.Scanner;

/**
 * 
 */

/**
 * @author Anaswara
 *
 */
public class QuickSort {
	
	/**
	 * 
	 */
	public static void quickSortImpl(int[] array, int low, int high) {
			
		if (low < high) {
		
			//index of pivot element
			int pivotIndex = partition(array, low, high );
			
			System.out.println("Pivot index is : " + pivotIndex); 
			//left side
			quickSortImpl(array, low, pivotIndex-1);
			//right side
			quickSortImpl(array, pivotIndex + 1, high);	
		}		
	}

	//Partitioning array based on pivot element
	private static int partition(int[] array, int low, int high) {
		
		System.out.println("in partition");
		int i  = low-1;
		//setting pivot as last element
		int pivot = array[high-1];
		for (int j = low; j < high ; j++) {
			
			if(array[j] < pivot) {
				
				i++;
				swap(array , i, j);
			}	
		}
		
		/**Setting the pivot element as all elements 
		* before(i'th position ) the pivot element will be
		* less than pivot element.
		**/
		swap(array,i+1, high-1);
		return (i+1);		
	}

	//swap elements
	private static void swap(int[] array, int i, int j) {
		int temp;
		
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// reading an array of integers from user and calling quick sort
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter input array size");
		int size = keyboard.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter elements");
		for(int i = 0; i<size ; i++) {
			array[i] = keyboard.nextInt();
		}
			
		quickSortImpl(array, 0, size);
		
		System.out.println("Array is :");
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}		
		keyboard.close();
		
	}

}
