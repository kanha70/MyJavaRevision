package ExceptionHandling;

import java.io.IOException;

class SecondEx {
    private int first;
    private int second;

    public void setValue(int x, int y){
        first = x;second = y;
    }
    public int result(){
        return first/second;
    }
    public void output() {
        System.out.println("Output is := "+result());
    }
}

class Example{
    public static void main(String[] args) {

           SecondEx obj = new SecondEx();
           obj.setValue(4,0);
           try {
               obj.output();
           }catch (ArithmeticException e){
               System.out.println("My Catch is Again Running ");
           }finally {
               obj.setValue(4,2);
               obj.output();
           }


    }
}