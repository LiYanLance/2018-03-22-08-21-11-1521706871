package practice07;

import practice06.Person;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age){
        super(name, age);
        klass = new Klass(-1);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String teacherIntroduce = klass.getNumber() != -1 ? "I teach " + klass.getDisplayName() +"." : "I teach No Class.";
        return super.introduce() + " I am a Teacher. " + teacherIntroduce;
    }

    public String introduceWith(Student student) {
        String teacherTeach =  " I " +  (klass.equals(student.getKlass()) ? "" : "don't ") + "teach " + student.getName()  + ".";
        return super.introduce() + " I am a Teacher." + teacherTeach;
    }
}
