package Collection.List;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Kanhaiya");
        stack.push("Anju");
        stack.push("Lucknow");
        stack.push("Noida");
        stack.push("Banglore");

        //Iterator for the stack;
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();

        stack.pop();
        itr = stack.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
