public class BankAccount{
    public void deposit(double amount){
        balance = balance + amount;
    }
    double balance;
    public void withdraw(int withdraw){
        balance = balance - withdraw;

    }

}

class SavingsAccount extends BankAccount{
    public void withdraw(int withdraw){
        if (balance<100){
            return;
        }
        balance = balance - withdraw;
    }

}
