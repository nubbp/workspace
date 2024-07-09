package Java_2.src.test;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println(bank.matchAccNumName("1111-1111", "이순신"));
        System.out.println(bank.matchAccNumName("1111-1113", "이순신"));

        System.out.println(bank.overBalanceList(25000));
        System.out.println(bank.overBalanceList(40000));

    }
}
