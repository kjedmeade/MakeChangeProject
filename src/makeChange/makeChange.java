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
		double changeB = findDollars(changeA);
		double changeC= changeA-changeB;
		double changeD=findQuarters(changeC);
		double changeE=(changeD*.25)+changeB;
		double changeF= changeA-changeE;
		double changeG= findDimes(changeF);
		double changeH= (changeG*.1)+ (changeD*.25)+changeB;
		double changeI= changeA-changeH;
		double changeJ =findNickels(changeI);
		double changeK= (changeH*.05)+(changeG*.1)+ (changeD*.25)+changeB;
		double changeL= changeA-changeK;
		double changeM =findPennies(changeL);
		
		
		
		System.out.println("Your change is " + changeB + " dollars, " +changeD+" quarters, " + changeG + " dimes, "+ changeJ+ " nickels, "+ changeM+" pennies, ") ;

		scanner.close();

	}

public static int findDollars(double change) {

	int dollars=0;
	if (change/1>=1) {
		dollars= (int)(change/1);	
	}
	return dollars;
}

public static int findQuarters(double change) {

	int quarters=0;
	if (change/.25>=1) {
		quarters= (int)(change/.25);	
	}
	return quarters;
}

public static int findDimes(double change) {

	int dimes=0;
	if (change/.1>=1) {
		dimes= (int)(change/.1);	
	}
	return dimes;
}

public static int findNickels(double change) {

	int nickels=0;
	if (change/.05>=1) {
		nickels= (int)(change/.05);	
	}
	return nickels;
}

public static int findPennies(double change) {

	int pennies=0;
	if (change/.01>=1) {
		pennies= (int)(change/.01);	
	}
	return pennies;
}



}
