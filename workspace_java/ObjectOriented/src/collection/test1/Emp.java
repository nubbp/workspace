package collection.test1;

public class Emp {
    int empId;
    String name;
    String partName;
    int phoneNum;
    int salary;

    public Emp(int empId, String name, String partName, int phoneNum, int salary) {
        this.empId = empId;
        this.name = name;
        this.partName = partName;
        this.phoneNum = phoneNum;
        this.salary = salary;
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

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
