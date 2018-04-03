package practice06;

public class Teacher extends Person{

    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age){
        super(name, age);
        klass = -1;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String teacherIntoduce = klass != -1 ? "I teach Class " + klass +"." : "I teach No Class.";
        return super.introduce() + " I am a Teacher. " + teacherIntoduce;
    }
}
