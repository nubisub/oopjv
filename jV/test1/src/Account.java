public class Account {
    private int id;
    private String name;
    private int balance = 0;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }
    public int transfer(Account toAccount, int amount) {
        if (amount <= balance) {
            balance -= amount;
            toAccount.balance += amount;
            return balance;   
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }
    public String toString() {
        return "Account[id=" +id+ ", name=" +name+ ", balance=" +balance+ "]";
    }
}
