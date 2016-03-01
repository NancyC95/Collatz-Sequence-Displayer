import java.util.Scanner;
public class CollatzSequence {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int n, max=0;
		int count = 0;
		
		
		System.out.println("Starting number: " );
		n = keyboard.nextInt();
		max = n; //saves max as the original start number!
		
		System.out.print(n+"\t");
		
		while (n > 1){
			if (n%2 == 0){
				n = n/2;
			}
			else if (n%2 == 1){ 
				n = (3*n) + 1;
			}
			if (n>max){
				max = n;
			}
			if (count %10 == 0){
				System.out.print("\n");
			}
			System.out.print(n + "\t");
			
			count++;	
		}
	System.out.println(" ");
	System.out.println("Terminated after " + count + " steps.");
	System.out.println("The largest value of the collatz sequence was: " + max);
	}
}


