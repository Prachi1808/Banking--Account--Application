// Create a class name as Saving Account
public class SavingAccount {

	/*using static veriable as annualInterstRate
	 *create a class contains a private instance variable as  savingBalance
	 *calculateMonthlyInterset by multiplaying the savingBalance by annualintrate divided by 1
	 * 
	 */
	private static double annualInterestRate=0;
	    private double savingBalance;
	    private double MothlyInterest;

	    public SavingAccount(double savingBalance) {
	        this.savingBalance = savingBalance;
	    }

	    public double getSavingsBalance() {
	        return savingBalance;
	    }
//calculateMonthlyInterset by multiplaying the savingBalance by annualintrate divided by 12
	    public void calculateMonthlyInterest() {
	    this.MothlyInterest  = (savingBalance * annualInterestRate )/ 12;
	    System.out.println("The monthly interest is :" + this.MothlyInterest);
	    }
//Here is provide a static method modifiyInterestRate which one is set as a AnnualInterestRate
	    public static void modifyInterestRate(double annualInterestRate) {
	    SavingAccount.annualInterestRate = annualInterestRate;
	    }
	
	
}

