package Java8Features.DoubleColonOperator;


import java.util.stream.Stream;

// :: is method Reference Operator -> Theu Behave exactly as Lambda Expression
//<Class name> :: <Method Name>
public class DoubleColonInJava {
    public static void main(String[] args) {
        Stream<String> stream
                = Stream.of("Geeks","For","Geeks","A","Computer","Portal");

        //Print the Stream
//        stream.forEach(s -> {
//            System.out.println(s);
//        });

        // Using :: operator
        stream.forEach(System.out ::println);
    }
}
