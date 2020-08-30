package makeChange;

import java.util.Scanner;

public class makeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter purchase price ");
		double num1 = scanner.nextDouble();
		System.out.println("Amount tendered");
		double num2 = scanner.nextDouble();
		
		
		double changeA = num2 - num1;
		double changeB = makeChange(changeA);
		
		
		System.out.println("Your change is " + changeB + "dollars") ;

		scanner.close();

	}

public static int makeChange(double change) {
	
	int dollars= (int)(change/1.00);
	double rem1= change-dollars;
	
	int quarters= (int) (rem1/.25);
 	double rem2= rem1-quarters;
 	
 	int dimes= (int) (rem2/.1);
 	double rem3= rem2-dimes;
 	
 	int nickels= (int) (rem3/.05);
 	double rem4= rem3-nickels;
 	
 	int pennies= (int) (rem4/.1);
 	double rem5= rem4-pennies;
 	
 	int zero = 0;
	
	if (change/1.00>=1) {
		return dollars;
	}
	 	
	 else if (rem1/.25>=1) {
	 	return quarters;
	 	
	 }
	 	
	else if (rem1/.1>=1) {
		return dimes;
	}
	
	else if (rem3 /.05>=1) {
		return nickels;
	}	
	
	else if (rem4 /.01>=1) {
		return pennies;
	}

	else{
		
		return zero;
	}
}

}
