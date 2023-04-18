package HW3;

import java.util.Comparator;

public class TeacherComporator implements Comparator<Human> {
    public int compare(Human human, Human anotherHuman) {
        if (human instanceof Teacher && anotherHuman instanceof Teacher) {
            Teacher teacher = (Teacher) human;
            Teacher anotherTeacher = (Teacher) anotherHuman;
            return Integer.compare(anotherTeacher.getStudentGroupSet().size(), teacher.getStudentGroupSet().size());
        }
        return 0;
    }
}
