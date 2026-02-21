// Write down a bank account class 
// data members: name,balance,interest rate
// method- how balance(),show_acc_details(),change_interest_rate()

class BankAccount {
    String name;
    double balance;
    static double interestRate;
    BankAccount(String name, double balance,double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    double show_balance() {
        return this.balance;
    }
    void show_acc_details() {
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.interestRate);
    }
    static void change_interest_rate(double newRate) {
        this.interestRate = newRate;
    }
}
public class  BankAccount {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("John Doe", 1000.0);
        a.show_acc_details();
        a.change_interest_rate(0.05);
    }
}
