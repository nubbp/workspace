package class_basic;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.printAccount();

        System.out.println("--------------");

        Account acc1 = new Account(1000000);
        acc1.printAccount();
    }
}
