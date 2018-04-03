package practice09;

public class Klass {
    private int number;
    private Student leader;

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
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(this.number);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Klass){
            return ((Klass) obj).getNumber() == number;
        }
        return false;
    }

    public String getDisplayName() {
        return "Class " + number;
    }
}
