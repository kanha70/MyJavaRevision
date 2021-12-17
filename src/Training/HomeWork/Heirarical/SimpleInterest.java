package Training.HomeWork.Heirarical;

import java.util.Scanner;

class Principle{
    private int principle;

    public void setPrinciple(int p){
        principle = p;
    }
    public double getPrinciple(){
        return principle;
    }
}


class Rate extends Principle {
     private double rate;

     public void setRate(double r){
         rate = r;
     }

    public double getRate() {
        return rate;
    }
}
class Time extends Principle{
   private double time;

   public void setTime(double t){
       time = t;
   }
   public double getTime(){
       return time;
   }
}


class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Principle Amount, Rate and Time for Calculate Simple Interest :");

       Rate r = new Rate();
       Time t = new Time();

       int pc = sc.nextInt();
       double rate = sc.nextDouble();
       double time = sc.nextDouble();

       r.setPrinciple(pc);
       r.setRate(rate);
       t.setTime(time);

       double si = r.getPrinciple() * r.getRate() * t.getTime()/100;
        System.out.println("Your Simple Interest of amount : "+r.getPrinciple()+" is "+si);

    }

}
