package Java_2.src.test;

public class MemberTest {
    public static void main(String[] args) {
        Member mem = new Member();

//        1)
        mem.setInfo("자바", "java", "abcd1234", 20);

        System.out.println("2)");
        mem.showInfo();

        System.out.println();
        System.out.println("3)");
        boolean isTrue = mem.isLogin("java", "abcd1234");
        if (isTrue) {
            System.out.println("로그인 가능");
        } else {
            System.out.println("로그인 불가능");
        }

        System.out.println();
        System.out.println("4)");
        boolean isTrue2 = mem.isLogin("java", "abcd");
        if (isTrue2) {
            System.out.println("로그인 가능");
        } else {
            System.out.println("로그인 불가능");
        }
    }
}
