import java.time.LocalDateTime;
public class BankAccount {
    BankAccount(String name){
        this.name = name;
        this.balance = 0;
        this.opening_date = LocalDateTime.now();
        this.booking = false;
    }
    String name;
    int balance;
    LocalDateTime opening_date;
    boolean booking;

    public boolean Deposit(int amount){
        if(amount>0 && !booking){
            balance = balance+amount;
            return true;
        }
        return false;
    }

    public boolean Withdraw(int amount){
        if(amount>0 && !booking && amount<=balance){
            balance = balance-amount;
            return true;
        }
        return false;
    }
    public boolean Transfer(BankAccount otherAccount, int amount){
        if(amount<=0 && booking && otherAccount.booking && balance< amount){
            return false;
        }
        balance -= amount;
        otherAccount.balance += amount;
        return true;
    }
}
