package practice08;

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

    public void assignLeader(Student student) {
        leader = student;
    }

    public Student getLeader() {
        return leader;
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
