package by.itstep.oop.inh.task;

public class Client {
   private int id;
   private  String name;
   private String email;
   private  String pas1;
    private  String pas2;
    private  String role;


    public Client(){
        this.role="default user";
    }


    public Client(int id, String name, String email, String pas1, String pas2, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pas1 = pas1;
        this.pas2 = pas2;
        this.role = role;
    }

    public Client(int id, String name, String email) {
        this(id, name, email, null,null, null);
    }




    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", pas1='****"  +
                ", role='" + role + '\'' +
                '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin1() {
        return pas1;
    }

    public void setPas1(String pas1) {
        this.pas1 = pas1;
    }

    public String getPas2() {
        return pas2;
    }

    public void setPas2(String pas2) {
        this.pas2 = pas2;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
