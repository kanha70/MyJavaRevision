package CollectionRevision;

import java.util.ArrayList;
import java.util.Collections;

public class CompratorEx {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(12,"Akhil"));
        al.add(new Student(9,"Babita"));
        al.add(new Student(17,"Pragya"));
        al.add(new Student(22,"Zonal"));

        System.out.println("Original");
        for (Student s:al){
            System.out.println(s);
        }
        Collections.sort(al,new SortByRollNo());
        System.out.println("After sorting by Roll Number");
        for (Student s:al) {
            System.out.println(s);
        }
        Collections.sort(al, new SortByName());
        System.out.println("After sorting by Name");
        for (Student student:al){
            System.out.println(student);
        }
    }
}
