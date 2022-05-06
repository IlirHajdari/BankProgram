public class Test{ // test class
	
   public static void main(String[] args) { // object setters
       CheckingAccount obj = new CheckingAccount();
      
       obj.setAccountID(501);
       obj.setFirstName("Anakin");
       obj.setLastName("Skywalker");
      
       obj.deposit(112);
      
       System.out.println(obj.accountSummary());
      
       obj.processWithdraw(150);
      
       obj.displayAccount();
      
     // end of program  
   }
}