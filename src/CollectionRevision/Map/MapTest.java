package CollectionRevision.Map;

import CollectionRevision.Map.Address;
import CollectionRevision.Map.Employee;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
    public static void main(String[] args) {

        HashMap<Employee, Address> ehm = new HashMap<Employee, Address>();

        Employee e1 = new Employee(1, "Ramu");
        Address a1 = new Address("Noida", "UP");
        Employee e2 = new Employee(2, "Chaman");
        Address a2 = new Address("Banaras", "Purvanchal");
        Employee e3 = new Employee(3, "Komal");
        Address a3 = new Address("Delhi", "Delhi");
        Employee e4 = new Employee(4, "Mayank");
        Address a4 = new Address("Lucknow", "UP");


        ehm.put(e1, a1);
        ehm.put(e2, a2);
        ehm.put(e3, a3);
        ehm.put(e4, a4);

        System.out.println("Data saved");

       Iterator<Employee> itr = ehm.keySet().iterator();

        while (itr.hasNext()) {
            Employee obj = (Employee) itr.next();
            System.out.println("Employee ID: " + obj.getEid());
            System.out.println("Employee Name: " + obj.getEname());

            Address ad = ehm.get(obj);
            System.out.println("City:"+ad.getCity());
            System.out.println("State:"+ad.getState());
        }

    }
}

