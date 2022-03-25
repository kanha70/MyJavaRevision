package Java8Features.DoubleColonOperator;

import java.util.ArrayList;
import java.util.List;

//Double colon operator
public class DCOEx2 {
    static void someFunction(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kanhaiya");
        list.add("Lal");
        list.add("Prajapati");

    list.forEach(DCOEx2::someFunction);
    }
}
