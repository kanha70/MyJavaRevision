package TestPractice;

class Prime extends Thread{
    public void run(){
        int number = 17;
        boolean flag = true;

        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                flag = false;
            }
        }
        if (flag ){
            System.out.println(" Prime");
        }else{ System.out.println("Not Prime");
        }
    }

}
class Armstorng extends Thread{
    public void run(){
        int number = 407;
        int original_number = number;
         int numberOfDigit=0;
         int arr[] = new int[5];
         int index = 0;
         while (number>0){
             arr[index] = number % 10;
            number= number / 10;
            numberOfDigit++;
            index++;
         }

         int sum = 0;
         for (int i = 0; i < numberOfDigit; i++) {
             sum += (arr[i]*arr[i]*arr[i]);
         }
             if (sum == original_number) System.out.println("YES! It is an Armastrong Number ");
             else System.out.println("No It's not an Armastrong Number");
         }
}


class Demo {
    public static void main(String[] args) {
        Prime t1 = new Prime();
        Armstorng t2 = new Armstorng();
        t1.start();
        t2.start();
    }
}
