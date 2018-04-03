package practice07;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
