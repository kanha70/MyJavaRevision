package CollectionRevision.Set;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx {
    public static void main(String[] args) {
        HashSet<Address> ehs = new HashSet<>();
        Address a1 = new Address("Lucknow","UP");
        Address a2 = new Address("Delhi","Delhi");
        ehs.add(a1);
        ehs.add(a2);

        Iterator itr = ehs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
     }
}
