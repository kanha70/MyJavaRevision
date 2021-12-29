package Training.Basic.Opps.Constructor;

class Rectangle {
  private double length;
  private  double width;

  public Rectangle(double x, double y){
      length = x;
      width = y;
  }
  public double area(){
      return length*width;
  }
}

class Example{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle.area());
    }
}