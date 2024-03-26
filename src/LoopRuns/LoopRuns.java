package LoopRuns;
public class LoopRuns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To write numbers between 1 and 10
		
		//Using for loop
		System.out.println("\nFor loop Started");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nFor loop ended");
		
		
		//Using while loop
		int j = 1;
		System.out.println("\nWhile loop Started");
		while(j <= 10) {
			System.out.print(j + " ");
			j++;
		}
		System.out.println("\nWhile loop ended");
		
		//Do-while loop 
		int k = 1;
		System.out.println("\nDo-while loop started");
		do {
			System.out.print(k + " ");
			k++;
		}while(k <=10);
		System.out.println("\nDo-while loop ended");
		
		//Using for-each loop
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\nFor-each loop started");
		for (int number: numbers) {
			System.out.print(number + " ");
		}
		System.out.println("\nFor-each loop ended");
			//More examples of for-each loop
			String[] fruits = {""};
	}

}

