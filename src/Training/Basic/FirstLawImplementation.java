package Training.Basic;

import java.util.Scanner;

public class FirstLawImplementation {
    public static void main(String[] args) {
        Velocity velocity = new Velocity();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the value of U,A and T Respectively");
        velocity.setU(scanner.nextDouble());
        velocity.setA(scanner.nextDouble());
        velocity.setT(scanner.nextDouble());
        double V = velocity.getU() + velocity.getA() * velocity.getT();
        System.out.println("The value of V is :"+V);

    }
}

class Velocity{
   double u;

    public void setU(double u) {
        this.u = u;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setT(double t) {
        this.t = t;
    }

    double a;
    double t;

    public double getU() {
        return u;
    }

    public double getA() {
        return a;
    }

    public double getT() {
        return t;
    }


}
