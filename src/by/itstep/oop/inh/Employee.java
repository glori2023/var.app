package by.itstep.oop.inh;

public class Employee extends Person{
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Employee(){
        // преждевсего запускается конструктор родительского класса, чтобы обеспечить инициализацию полей
        // явный вызов конструктора родительского класса. если не написать, вызов произойдет неявно
        super();

    }

    public Employee(int id, String name, String lastName){
        //вызов супер конструктора с парраметрами. конструктор должен существовать с такими же парраметрами
        super(id, name);
        this.setLastName(lastName);
    }

    public Employee(int id, String name, String lastName, char gender, long salary){
        super(id, name, lastName, gender);
        this.salary= salary;
    }





    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", gender=" + getGender() +
                ", salary=" + salary +
                '}';
    }
}

