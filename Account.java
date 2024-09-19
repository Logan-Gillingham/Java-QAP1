public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;

    }

    public int credit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be positive.");
            return balance;
        }
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be positive.");
            return balance;
        }
        if (amount > balance) {
            System.out.println("Amount exceeded balance.");
            return balance;
        }
        balance -= amount;
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be positive.");
            return balance;
        }
        if (amount > balance) {
            System.out.println("Amount exceeded balance.");
            return balance;
        }
        balance -= amount;
        another.credit(amount);
        return amount;
    }

    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}