package Training.Basic;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(3.0);
        rectangle.setWidth(4);

        double area = rectangle.getLength() * rectangle.getWidth();
        System.out.println("Area of Rectangle is : "+area);

    }
}

class Rectangle{
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double length;
    private double width;


}
