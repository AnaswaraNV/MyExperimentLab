import java.util.Scanner;

public class countDuplicates {

	public countDuplicates() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		boolean numberExist =false;
		int count=0;
		
		System.out.println("Enter limit");
		int limit = keyboard.nextInt();
		int[] numbers = new int[limit];
		
		System.out.println("Enter array");
		for (int i = 0; i<limit ; i ++ ) {
			numbers[i] = keyboard.nextInt();
		}
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++ ) {
				
				if( i != j ) {
					if(numbers[i] == numbers[j]) {
						numberExist = true;	
						break;
					}
				}
			}
			
			if(numberExist) {
				count++; 
			}
			System.out.println("element" + numbers[i] + count); 
		}
		
		System.out.println("count is " + count);
		keyboard.close();
	}

}
