package Java8Features.DefaultMethod;

interface Sayable1{
    static void sayLouder(String str){
        System.out.println(str);
    }
}
public class StaticMethod implements Sayable1 {
    public static void main(String[] args) {
        Sayable1.sayLouder("This is static method inside Interface.");
    }
}
