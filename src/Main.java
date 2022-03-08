/* Write a program to test class SavingAccount
 * class name mantion as Main
 */
public class Main 
{

public static void main(String[] args) 
{
//create saver1 with balance of 2000
	        SavingAccount saver1 = new SavingAccount(2000);
//Create saver2 with balance of 3000
	        SavingAccount saver2 = new SavingAccount(3000);

/*Here we take the AnnualIntersetRate 4% 
 * For calculate monthly interset 
 * Print the new Balance for both savers
 */
	        SavingAccount.modifyInterestRate(0.04);
	        for (int i = 0; i <= 12; i++)
{
	        saver1.calculateMonthlyInterest();
	        saver2.calculateMonthlyInterest();

	        System.out.println("_______Saving Account_______");
	        System.out.println("Account Balance for saver1: " + saver1.getSavingsBalance());
	        System.out.println("Account Balance for Saver2: " + saver2.getSavingsBalance());
	
	        
	/*Here we take the AnnualIntersetRate 5% 
	 * For calculate next monthly interset 
	 * Print the new Balance for both savers
	 */
	          
	        SavingAccount.modifyInterestRate(0.05);
{
	        saver1.calculateMonthlyInterest();
	        saver2.calculateMonthlyInterest();
	        System.out.println("_______Saving Account_______");
	        System.out.println("Nextmonths Account Balance for Saver1:  " + saver1.getSavingsBalance());
	        System.out.println("Nextmonths Account Balance for Saver2: " + saver2.getSavingsBalance());
  }

}
	        
	        
}
}