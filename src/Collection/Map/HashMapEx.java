package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"Geeks");
        hm.put(2,"For");
        hm.put(3,"Geeks");

        //Finding the value for a key;
        System.out.println("Value for 2 is :" + hm.get(2) );

        Iterator<Integer> it = hm.keySet().iterator();

        System.out.println("HashMap Elements");
        System.out.println("-----------------------");

        while (it.hasNext()){
            int key = it.next();
            System.out.println("Key ="+key);
            System.out.println("Value="+hm.get(key));
        }

//        for(Map.Entry<Integer,String> e: hm.entrySet()){
//            System.out.println(e);
//        }




        //Traversing through the HashMap
//      for (Map.Entry<Integer,String> e : hm.entrySet())
//          System.out.println(e.getKey()+" "+e.getValue());
    }
}
