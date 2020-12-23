import java.util.Date;

public
class Employee {
    String name;
    int yoj;
    Double salary;
    Address address;

    public
    Employee (  ) {
        System.out.println ( "Employee has been created" );
    }

    public
    Employee ( String name, int yoj, Address address ) {
        this.name = name;
        this.yoj = yoj;
        this.address = address;
    }

    public
    Employee ( String name, int yoj, Double salary, Address address ) {
        this.name = name;
        this.yoj = yoj;
        this.salary = salary;
        this.address = address;
    }

    public
    String getName () {
        return name;
    }

    public
    void setName ( String name ) {
        this.name = name;
    }

    public
    int getyoj () {
        return yoj;
    }

    public
    void setyoj ( int yoj ) {
        this.yoj = yoj;
    }

    public
    Double getSalary () {
        return salary;
    }

    public
    void setSalary ( Double salary ) {
        this.salary = salary;
    }

    public
    Address getAddress () {
        return address;
    }

    public
    void setAddress ( Address address ) {
        this.address = address;
    }

    public void display(){

        System.out.println (this.getName() +"            "+this.getyoj()+"                     "+this.getAddress().getBuilding ()+"-"+this.getAddress().getStreet ());

    }

    public static void main(String[] args){
        Address a1=new Address("64C","WallsStreet");
        Address a2=new Address("68D","WallsStreet");
        Address a3=new Address("26B","WallsStreet");
        Employee e1=new Employee ( "Robert" ,1994 ,a1);
        Employee e2=new Employee ( "Sam" , 2000,a2);
        Employee e3=new Employee ("John",1999,a3);
        System.out.println ( "Name          Year Of Joining         Address" );
        e1.display ();
        e2.display ();
        e3.display ();
    }
}


