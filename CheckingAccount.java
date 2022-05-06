public class CheckingAccount extends BankAccount{
   private double interestRate = 5; //5% interest
   private final int fee = 30; //fee amount
  
   public CheckingAccount() {
       super();
   }
  
   public void processWithdraw(double amount) {
       withdraw(amount); // amount withdraw
       if(getBalance()<0) { //if amount is -ve
           withdraw(fee); // fee deduction
           System.out.println("Overdraft fee has been accessed.");
       }
   }
  
   public void displayAccount() { //showing account details with interest
       System.out.println(accountSummary()+", Interest Rate: "+interestRate+"%");
   }
}