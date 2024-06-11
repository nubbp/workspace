package class_basic.class_3;

public class Stu {
    private String name;
    private int age;
    private String grade;
    private String tel;

    public Stu(String name, int age, String grade, String tel) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.tel = tel;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("학점: " + grade);
        System.out.println("연락처: " + tel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
