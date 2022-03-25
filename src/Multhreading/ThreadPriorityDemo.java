package Multhreading;

public class ThreadPriorityDemo extends Thread {

    public void run() {
        System.out.println("inside the Run method");
    }
    public static void main(String[] args) {

        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        t1.start();

        System.out.println("Priority of the Thread t1 is : " + t1.getPriority());

        t1.setPriority(8);
        System.out.println("Priority of t1 thread is:4_> " + t1.getPriority());

    }
}
