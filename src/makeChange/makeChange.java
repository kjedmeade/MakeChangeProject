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
		
		double changeB = findTenDollars(changeA);
		double changeC=(changeB*10);
		double changeD= changeA-changeC;
		double changeE=findFiveDollars(changeD);
		double changeF=(changeE*5)+(changeB*10);
		double changeG= changeA-changeF;
		double changeH=findOneDollars(changeG);
		double changeI=(changeH*1)+(changeE*5)+(changeB*10);
		double changeJ= changeA-changeI;
		double changeK=findQuarters(changeJ);
		double changeL=(changeK*.25)+(changeH*1)+(changeE*5)+(changeB*10);
		double changeM= changeA-changeL;
		double changeO= findDimes(changeM);
		double changeP= (changeO*.1)+(changeK*.25)+(changeH*1)+(changeE*5)+(changeB*10);
		double changeQ= changeA-changeP;
		double changeR =findNickels(changeQ);
		double changeS= (changeR*.05)+(changeO*.1)+(changeK*.25)+(changeH*1)+(changeE*5)+(changeB*10);
		double changeT= changeA-changeS;
		double changeU =findPennies(changeT);
		
		if (changeA>=0 && num2>=.01 && num2<=20) {
			System.out.println("Your change is " + changeB + " ten dollar bils, " +changeE+" five dollars bills, " + changeH + " one dollar bills, "+ changeK+ " quarters, "+ changeO+ " dimes, "+ changeR+ " nickels, and "+ changeU+ " pennies ") ;
			
		}
		else {
			System.out.println("You have entered an incorrect entry");
		}


		scanner.close();
		
	}

public static int findTenDollars(double change) {

	int tendollars=0;
	if (change/10>=1) {
		tendollars= (int)(change/10);	
	}
	return tendollars;
}
public static int findFiveDollars(double change) {

	int fivedollars=0;
	if (change/5>=1) {
		fivedollars= (int)(change/5);	
	}
	return fivedollars;
	
}

public static int findOneDollars(double change) {

	int onedollars=0;
	if (change/1>=1) {
		onedollars= (int)(change/1);	
	}
	return onedollars;
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
		pennies= (int)((change/.01)+.01);	
	}
	return pennies;
}
	


		
}


