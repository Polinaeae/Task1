public class Main{
    public static void main (String[] args) {
        BankAccount account1 = new BankAccount("Vladik");
        System.out.println(account1.name);
        BankAccount account2 = new BankAccount("Dimasik");
        System.out.println(account2.name);

        System.out.println("Создание счета");
        System.out.println(account1);
        System.out.println(account2);

        System.out.println("Пополнение счета на 500 " + account1.Deposit(500));
        System.out.println("Cнятие 100 рублей " + account1.Withdraw(100));
        System.out.println("Перевод 50 рублей Dimasikу  " + account1.Transfer(account2, 50));
    }
}
