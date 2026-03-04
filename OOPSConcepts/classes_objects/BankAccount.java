package OOPSConcepts.classes_objects;

public class BankAccount {
    String accountHolder;
    double balance;
    // constructor creation
    public BankAccount(String accountHolder, double b){
        this.accountHolder=accountHolder;
        balance=b;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount Deposited: "+amount);
        System.out.println("Update Balance is"+balance);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Deducted Amount is:" + amount);

        } else {
            System.out.println("Insufficient Balance");
        }
    }
        void displayBalance( ){
            System.out.println("Account holder is "+accountHolder);
            System.out.println("Current Balance is "+balance);
        }
    }

class Balances{
    public static void main(String[] args) {
        BankAccount b1 =new BankAccount("Shrusti",7000);
        b1.displayBalance();
        b1.deposit(1000);
        b1.withdraw(3000);
        b1.displayBalance();

    }
}
