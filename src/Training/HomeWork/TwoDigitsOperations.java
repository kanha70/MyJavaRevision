package Training.HomeWork;

///// NOT Runnable without CLI Input;

public class TwoDigitsOperations {

    public static void main(String[] args) {
        Test obj = new Test();

        obj.setRadius(Double.valueOf(args[0]));

        double area = Math.PI* obj.getRadius()* obj.getRadius();
        System.out.println(area);
    }


}
class Test{
    private double radius;

    public void setRadius(double a){
        radius = a;
    }
    public double getRadius(){
        return radius;
    }

}