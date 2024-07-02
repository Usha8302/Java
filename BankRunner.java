public class BankRunner {
    public static void main(String[] args) {
        Bank.getAccountBalance(12345);
        Bank.getAccountHolderName(12345);
        Bank.depositAmount(12345, 500);
        Bank.withdrawAmount(12345, 200);
        Bank.getRemainingBalance(12345);
    }
}