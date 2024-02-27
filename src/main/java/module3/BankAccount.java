package module3;

public class BankAccount {
    private String accountNumber;
    private double balance;
    //Access modifiers in java: 1. public (can be used throughout whole project)  2.private (within class only) 3. protected (within package) 4.default

    //Constructor method
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Instance method to deposit

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Withdraw" + amount + "from account" + accountNumber);

    }

    //Instance method to withdraw
    public void withdraw(double amount) {
        if (balance>= amount){
            balance -= amount;
            System.out.println("Withdraw" + amount + "from account" + accountNumber);
        }
        else{
            System.out.println("Insufficient balance in account:" + accountNumber);
        }

    }

    //Accessor method

    public double getBalance() {
        return balance;
    }

    //Static method
    public static void transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {

        if (fromAccount.balance >= amount) {
            fromAccount.balance -= amount;
            toAccount.balance += amount;
            System.out.println("Transfer" + amount + " from account" + fromAccount);

        }
    }

    public static void main(String[] args) {

        //creating two bank accounts
        BankAccount account1 = new BankAccount("1111", 10000);
        BankAccount account2 = new BankAccount("2222/", 10000);

        //Depositing money into account1
        account1.deposit(1000);

        //Withdrawing money from account 1
        account1.withdraw(1000);

        //Transfering money from account1 to account2
        BankAccount.transfer(account1, account2, 1000);

        //Display final balance
        System.out.println("Final balance of account1" +account1.getBalance());
        System.out.println("Final balance of account2" +account2.getBalance());




    }



}
