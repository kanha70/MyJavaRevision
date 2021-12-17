package Collection.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Geeks");
        lhs.add("for");
        lhs.add("Geeks");
        lhs.add("is");
        lhs.add("Very Helpful");

        Iterator itr = lhs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
