public class Bank{
	
    private static double balance = 1500.75;

    public static void getAccountBalance(int accountNumber) {
       
        System.out.println("Account Balance = " + balance);
    }

    public static void getAccountHolderName(int accountNumber) {
        
        System.out.println("Account Holder Name = Usha");
    }

    public static void depositAmount(int accountNumber, double amount) {
        
        balance += amount;
        System.out.println("New Balance after Deposit = " + balance);
    }

    public static void withdrawAmount(int accountNumber, double amount) {
     
        balance -= amount;
        System.out.println("New Balance after Withdrawal = " + balance);
    }

    public static void getRemainingBalance(int accountNumber) {
      
        System.out.println("Remaining Balance = " + balance);
    }
}



