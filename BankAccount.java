public class BankAccount { //instance variables - fields
   
   private String firstName; 
   private String lastName;
   private int accountID;
   private double balance;

   public BankAccount() { //The Constructor - 0 balance
       balance = 0;
   }
  
   
   public void deposit(double amount) { //deposit - accepts single value double param
       balance += amount;
   }
  
   
   public void withdraw(double amount) { //withdraw
       balance -= amount;
   }
  
   
   public String getFirstName() { //firstName, lastName, and accountID getters and setters
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public int getAccountID() {
       return accountID;
   }

   public void setAccountID(int accountID) {
       this.accountID = accountID;
   }
  
   
   public double getBalance() { //Checking balance
       return balance;
   }
  
   
   public String accountSummary() { //Account details
       String name = "Name: " + firstName + " " + lastName;
       String accountInfo = name + ", Account: " + accountID + ", Balance: $" + balance;
       return accountInfo;
   }
}

