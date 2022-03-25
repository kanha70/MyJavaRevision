package Java8Features.DefaultMethod;

interface Sayable{
    default void say(){
        System.out.println("Inside Interface this is default method.");
    }
    void sayMore(String s);
}
public class DefaultMethod implements Sayable {
    public static void main(String[] args) {
         DefaultMethod dm = new DefaultMethod();
         dm.say();
         dm.sayMore("Hi this is SayMore Abstract Method");
    }

    @Override
    public void sayMore(String s) {
        System.out.println(s);
    }
}
