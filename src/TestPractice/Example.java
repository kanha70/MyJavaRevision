package TestPractice;

class AreaOfRectangle{

    private double length;
    private double width;

    public void setLength(double x){
        length = x;
    }

    public void setWidth(double y){
        width = y;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }


    class Demo{
        public static void main(String []args){
            AreaOfRectangle obj = new AreaOfRectangle();

            obj.setLength(Double.valueOf(args[0]));
            obj.setWidth(Double.valueOf(args[1]));

            double area = obj.getLength();

            System.out.println("Area is :"+ area);
        }
    }
}