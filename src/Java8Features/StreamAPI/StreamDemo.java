package Java8Features.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> list = List.of(2,3,5,34,56,67,23,60);
        //List<Integer> list1 = list.stream().filter(i -> i >50 ).collect(Collectors.toList());
        //System.out.println(list1);
//
//        ArrayList <Integer> list2 = new ArrayList<>();
//        for (int x:
//             list) {
//            if (x%2==0){
//                list2.add(x);
//            }
//        }
//        System.out.println(list2);
    }
}
