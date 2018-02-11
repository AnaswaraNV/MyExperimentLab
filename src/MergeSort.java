
public class MergeSort {
	

	public MergeSort(int[] arr) {
		int[] helper = null;
	    MergeSortMethod(arr, helper, 0, arr.length-1);
	}
	
	public void MergeSortMethod(int[] arr, int[] helper, int low, int high) {
		
		int middle = (low + high ) / 2;
		int[] helperLeft = null;
		int[] helperRight = null;
		
		System.out.println("low: " + low);
		System.out.println("ihgh: " + high);
		
		if(low < high) {
			System.out.println("middle" + middle);
			MergeSortMethod(arr, helperLeft, low, middle );
		} else {
			MergeSortMethod(arr, helperRight, middle + 1, high );
		}
		
		int[] array = merge(helperLeft, helperRight);
		for(int i=0; i<arr.length; i++) {
			System.out.println("here" + "\n" + array[i]);
		}
	}
	
	public int[] merge(int[] helperLeft, int[] helperRight) {
		int[] arr = null;
		int middle = helperLeft.length-1;
		System.out.println("middle here" + middle);
		for(int i=0; i< (helperLeft.length + helperRight.length - 2) ; i++ ) {
			if(i<middle) {
				arr[i] = helperLeft[i];
			} else if(i >= middle) {
				arr[i] = helperRight[i];
			}
		}
		return arr;
	}
	
	public static void main(String[]  args) {
		int[] arr = {5, 50, 2, 10, 60, 1, 5 };
		MergeSort obj = new MergeSort(arr);
		
		//[] arrSort = obj.mergeSortMethod(arr);
		
	}


}
