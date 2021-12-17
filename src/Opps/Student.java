package Opps;

public class Student{
    int RollNo;
    String Name;
    void insert(int id, String name){
        RollNo = id;
        Name = name;
    }
  void display(){
        System.out.println(RollNo+" "+Name);
    }


}


class Student1{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insert(101,"Kanhaiya");
        s2.insert(102,"Anju");

        s1.display();
        s2.display();

    }
}
