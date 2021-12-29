package Multhreading;

class First implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++){

        try {
            Thread.sleep(500);
            Thread t = Thread.currentThread();
            t.setName("First");
            System.out.println("Thread name "+t.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
       }
   }
}

class Demo{
    public static void main(String[] args) {
        First t1 = new First();
        Thread x = new Thread(t1);
        x.start();
    }
}
