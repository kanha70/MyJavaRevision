package Training.Basic.Opps.Constructor;

 class PolymorphismEx {

   public void value(int x){
      System.out.println("Integer value :"+x);
   }
   public void value(double x){
      System.out.println("Double value :"+x);
   }
   public void value(String x){
      System.out.println("String value :"+x);
   }

   public static void main(String[] args) {
         PolymorphismEx obj = new PolymorphismEx();
         obj.value(5);
         obj.value(7.0);
         obj.value("Kanhaiya");
      }

}

