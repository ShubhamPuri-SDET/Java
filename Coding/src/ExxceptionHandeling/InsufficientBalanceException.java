
public class InsufficientBalanceException extends Exception {

    private double amount;

    public InsufficientBalanceException(double amount) {
        super("you dont have sufficient balance: ");
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}