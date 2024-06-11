package class_basic;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("java", "kim", 1000);
        System.out.println(book1.title);

        Book b2 = new Book("a", "b", 2000);

        Book book3 = book1;
        System.out.println(book1.title);
        System.out.println(book3.title);
        book1.title = "c++";
        System.out.println(book1.title);
        System.out.println(book3.title);

//        기본자료형
        int num = 5;
        int num2 = num;
        double num3 = num2;
        double num4 = 5.5;
//        int num5 = num4;

        int num6 = 7;
//        String a = num6;
    }
}
