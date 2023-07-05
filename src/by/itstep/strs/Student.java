package by.itstep.strs;

public class Student {
    private int id;
    private  String name;
    private  String lastName;
    private double avg;

    public Student() {

    }
    public Student(int id, String name, String lastName, double avg) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
