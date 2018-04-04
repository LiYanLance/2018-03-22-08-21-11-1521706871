package practice11;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    private int number;
    private Student leader;
    private Set<Teacher> teachers = new HashSet<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        if (number == student.getKlass().getNumber()) {
            leader = student;
            notifyTeacher(student.getName() + " become Leader of Class " + number + ".\n");
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(this.number);
        notifyTeacher(student.getName() + " has joined Class " + number + ".\n");
    }

    public boolean isIn(Student student) {
        return this.equals(student.getKlass());
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Klass) {
            return ((Klass) obj).getNumber() == number;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.number;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void notifyTeacher(String message) {
        if(!teachers.isEmpty()){
            teachers.forEach(teacher -> teacher.reciveMessage(message));
        }
    }

}
