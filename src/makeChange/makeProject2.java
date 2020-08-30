package makeChange;

public class makeProject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 else if (rem1 %.25>=1) {
			 	return quarters;
			 	
			 }
			 	
			else if (rem1 %.1>=1) {
				return dimes;
			}
			
			else if (rem3 %.05>=1) {
				return nickels;
			}	
			
			else if (rem4 %.01>=1) {
				return pennies;
			}

			else{
				
				return zero;
			}
		 
		 int quarters= (int) (rem1/.25);
		 	double rem2= rem1-quarters;
		 	
		 	int dimes= (int) (rem2/.1);
		 	double rem3= rem2-dimes;
		 	
		 	int nickels= (int) (rem3/.05);
		 	double rem4= rem3-nickels;
		 	
		 	int pennies= (int) (rem4/.1);
		 	double rem5= rem4-pennies;

	}

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




int quarters= (int) (rem1/.25);
	double rem2= rem1-quarters;
	
	int dimes= (int) (rem2/.1);
	double rem3= rem2-dimes;
	
	int nickels= (int) (rem3/.05);
	double rem4= rem3-nickels;
	
	int pennies= (int) (rem4/.1);

	
	public static int findQuarters(double change) {
		double num=change- (int)change
		int quarters=0;
		if (change/1>=.25) {
			quarters= (int)(change/1);	
		}
		return quarters;\
		
		
		else if (rem1 %.1>=1) {
			return dimes;
		}
		
		else if (rem3 %.05>=1) {
			return nickels;
		}	
		
		else if (rem4 %.01>=1) {
			return pennies;
		}

		else{
			
			return zero;