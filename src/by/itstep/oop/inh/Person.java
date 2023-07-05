package by.itstep.oop.inh;

public class Person {
    private  int id;
    private  String name;
    private  String lastName;
    private char gender;


 //   конструктор  - единственный способ в джава создать объект
// конструктор никогда ничего не возвращает

public Person(){
    // System.out.println("Person + 1");
//    this.name="stranger";
    //вызов существующего конструктора в классе
    // вызов конструктора д.б.первой инструкцией

    this(0,"stranger");
}


// конструктор, который будет инициализировать поля
    public Person(int id,String name, String lastName, char gender){
        System.out.println("Person + 1");
        this.id=id;
        this.name=name;
        this.lastName=lastName;
        this.gender=gender;
    }

    public Person(int id,String name){
    //    System.out.println("Person + 1");
   //     this.id=id;
   //     this.name=name;
    //    this.lastName=lastName;
   //     this.gender=gender;
        this(id,name,null,' ');
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}


class Test{
    public static void main(String[] args) {
        Person p = new Person();
        p.setId(123);
        p.setLastName("Ivanova");
        p.setName("Lisa");
        p.setGender('f');

        System.out.println(p.toString());

        Person p2 = new Person();
        System.out.println(p2.toString());

        Person p3 = new Person();
        System.out.println(p3);

        Employee e1 = new Employee();
        e1.setId(234);
        e1.setName("John");
        e1.setGender('m');
        e1.setSalary(234578);
        System.out.println(e1.toString());

        Person p4 = new Person(55, "Bill", "Spenser", 'm');
        System.out.println(p4);

        Person p5 = new Person(155, "Tom");
        System.out.println(p5);

        Employee e2 = new Employee();
        System.out.println(e2);

        Employee e3 = new Employee(2345,"Alex", "Ivanov", 'm',23433);
        System.out.println(e3);

        Student s1 = new Student(12, "Peter","Nass", 'm',12.3);
        System.out.println(s1);
    }

}