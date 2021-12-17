package Training.Basic.Opps;

class A{
      private double length;

      public void setLength(double l){
          length = l;
      }
      public double getLength(){
          return length;
      }
}

class B extends A{
         private double width;

         public void setWidth(double b){
             width = b;
         }
         public double getWidth(){
             return width;
         }
}
class C extends A{
    private double height;
    public void setHeight(double h){
        height = h;
    }
    public double getHeight(){
        return height;
    }
}


public class Hierarical_Inheritance {
    public static void main(String[] args) {

        B b = new B();

        //  b.setLength(4.0);
        b.setWidth(5.0);

        C c = new C();
        c.setHeight(7.0);
        c.setLength(4.0);

        double volume =c.getLength()* b.getWidth() * c.getHeight();
        System.out.println("Area of Shape is :"+volume);
        //  System.out.println(b.getLength());
    }

}