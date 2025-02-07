
public class Bankaccount {

    private double balance;

    public Bankaccount() {
        this.balance = 0;
    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawMoney(double amount) throws Exception {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance);
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

    public static void main(String[] args) throws Exception {
        Bankaccount account = new Bankaccount();
        account.depositMoney(10);
        account.withdrawMoney(50);
    }
}
