package Opps.Aggregation;

public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.county);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Noida","Uttar Pradesh","India");
        Address address2 = new Address("Delhi","Delhi","India");

        Employee employee = new Employee(111,"Kanhaiya",address1);
        Employee employee2 = new Employee(117,"Deepak",address2);

        employee.display();
        employee2.display();
    }


}
