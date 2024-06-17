package collection.test1;

public class Emp {
    private int empId;
    private String name;
    private String partName;
    private String phoneNum;
    private int salary;

    public Emp(int empId, String name, String partName, String phoneNum, int salary) {
        this.empId = empId;
        this.name = name;
        this.partName = partName;
        this.phoneNum = phoneNum;
        this.salary = salary;
    }

    public String getPw() {
        return phoneNum.substring(5);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "이름 : " + name +
                "   월급 : " + salary;
    }
}
