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

}
