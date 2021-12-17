package Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");

        Iterator itr = ts.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
