package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Kanhaiya");
        hs.add("Every");
        hs.add("Difficult");
        hs.add("phase");
        hs.add("is a Source");
        hs.add("To make you");
        hs.add("Stronger");

        //Traversing elements
        Iterator itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
