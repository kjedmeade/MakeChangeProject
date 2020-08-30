package makeChange;

public class makeChange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase price ");
		int num1 = sc.newInt();
		System.out.println("Amount tendered");
		int num2= sc.nextInt();

		
		
		
	change =num1-num2
	 if change %1.00>1
	 	dollars= (int) change/1.00
	 	rem1= change-dollars
	 	
	 else if rem1 %.25>=1
	 quarters= (int) rem1/.25
	 rem2= rem1-quarters
	 	
	else if rem1 %.1>=1
	dimes= (int) rem2/.1
	rem3= rem2-dimes
	
	else if rem3 %.05>=1
	nickels= (int) rem3/.05
	rem4= rem3-nickels
	
	else if rem4 %.01>=1
	pennies= (int) rem4/.1
	rem5= rem4-pennies
	
	else
		System.err.println("error);
	
				
		Sysout(Your change is rem1 +" dollars "+ rem2 + " quarters "+ rem3 + " dimes " + rem4+" nickels ")		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if num1-num2%