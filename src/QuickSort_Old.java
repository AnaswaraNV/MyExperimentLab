
public class QuickSort_Old {

	public QuickSort_Old(int[] array) {
		// TODO Auto-generated constructor stub
		int high=array.length, low=0, pivot, i= -1;;
		System.out.println("here");
		
		pivot = array[high-1];
		System.out.println("high is " + high) ;
		System.out.println("Pivot element is" + pivot);
		
		for(int j=low; j< high-1; j++) {
			if(low<high) {
				System.out.println("in");
				System.out.println("j" + j + "low" + low);
				i++;
				System.out.println("low here" + low);
				System.out.println("varaiabeles" + array[j] + pivot);
				if(array[j] < pivot) {
					swap(array[j], array[i]);
				}
			}
		}
	}
	
	public void swap(int a, int b) {
		int temp; 
		temp = a ; 
		a= b;
		b=temp;
	}

	public static void main(String[] args) {
		int[] array = {10, 4, 3 , 6, 7, 18, 1};
		QuickSort_Old obj = new QuickSort_Old(array);
		

	}

}
