package by.itstep.oop;

public class Student {
    private  String name;
    private double avq;

    // has a relationship у студента есть университет

    private University university;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvq() {
        return avq;
    }

    public void setAvq(double avq) {
        this.avq = avq;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
class University{
    private  String name;
    private String location;
    private int numberOfStudents;

    // has a relationship у университет есть учитель
private Teacher [] teachers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
}

class Teacher{
    private  String name;
    private int exp;
    private long salary;
    // has a relationship у учителя есть университет

    private University university;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}

class Test{

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("John");
        t1.setSalary(2000);
        t1.setExp(7);

        Teacher t2 = new Teacher();
        t2.setName("Ben");
        t2.setSalary(4000);
        t2.setExp(10);


        Teacher[] teachers={t1,t2};
   //     Teacher[] teachers2=new Teacher[100];

        University university= new University();
        university.setName("BNTU");
        university.setLocation("BLR");
        university.setNumberOfStudents(1500);
        university.setTeachers(teachers);


        Student s1 = new Student();
        s1.setName("Val");
        s1.setAvq(3);
        s1.setUniversity(university);

    }
}