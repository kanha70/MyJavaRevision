package Experiment;

public class ContructorChaining {
    ContructorChaining(){
        this(5,4);
        System.out.println("This is void  First constructor");
    }
    ContructorChaining(int x, int y){
        this(1,2,3);
        System.out.println("Second Constructor :"+(x+y));
    }
    ContructorChaining(Integer x,Integer y, Integer z){
        System.out.println("Third Constructor: "+(x+y+z));
    }

    public static void main(String[] args) {
        ContructorChaining contructorChaining = new ContructorChaining();
    }
}
