package collection.test2;

import java.util.List;

public class School {
    private List<StudyClass> classList;

    public School(List<StudyClass> classList) {
        this.classList = classList;
    }

    public void printClassStudent(String teacher) {
        for (StudyClass e : classList) {
            if (teacher.equals(e.getTeacher())) {
                System.out.println(e.getStudentList());
            }
        }
    }

    public List<StudyClass> getClassList() {
        return classList;
    }

    /*public void classAvg() {
        for ()
    }*/
}
