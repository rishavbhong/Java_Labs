class Bank {
    public double deposit(double amount, double balance) {
        balance += amount; 
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + balance);
        return balance;
    }

    public double withdraw(double amount, double balance) {
        if (balance >= amount) {
            balance -= amount; // Subtract withdrawal amount from the balance
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal unsuccessful.");
            balance = 0;
        }
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();

        double balance = 1000.00;

        balance = bank.deposit(500.00, balance); 
        balance = bank.withdraw(200.00, balance); 
        balance = bank.withdraw(1500.00, balance); 
    }
}
