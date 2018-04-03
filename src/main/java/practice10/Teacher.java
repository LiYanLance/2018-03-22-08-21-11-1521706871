package practice10;

import java.util.*;
import java.util.stream.Collectors;

public class Teacher extends Person{

    private Set<Klass> classes;

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age){
        super(id, name, age);
        classes = new HashSet<>();
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String introduce() {
        String classesString = classes.stream().mapToInt(Klass::getNumber)
                .mapToObj(n -> String.valueOf(n)).collect(Collectors.joining(", "));
        String teacherIntroduce = !classes.isEmpty() ? "I teach Class " + classesString + "." : "I teach No Class.";
        return super.introduce() + " I am a Teacher. " + teacherIntroduce;
    }

    public String introduceWith(Student student) {
        String teacherTeach =  " I " +  (classes.contains(student.getKlass()) ? "" : "don't ") + "teach " + student.getName()  + ".";
        return super.introduce() + " I am a Teacher." + teacherTeach;
    }

    public Set<Klass> getClasses(){
        return classes;
    }
}
