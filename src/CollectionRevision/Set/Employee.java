package CollectionRevision.Set;

public class Employee {

    private int eid;
    private String ename;
   // private Address address;

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
        //this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

//    public Address getAddress() {
//        return address;
//    }
}