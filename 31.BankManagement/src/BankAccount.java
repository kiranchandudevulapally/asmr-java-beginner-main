public class BankAccount {
    private double balance;
    private final String accountHolder;

    public BankAccount(double initialBalance, String accountHolder) {
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
    public void showAccountHolder() {
        System.out.println("Holder name: " + accountHolder);
    }
}
