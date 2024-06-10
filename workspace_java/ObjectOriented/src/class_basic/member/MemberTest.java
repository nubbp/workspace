package class_basic.member;

public class MemberTest {
    public static void main(String[] args) {
        Member mem1 = new Member();
        mem1.setAll("ㅁㅁㅁ", "아이디", "비번", 554);

        mem1.printMemInfo();

        mem1.chanegeName("엉");
        mem1.printName();
    }
}
