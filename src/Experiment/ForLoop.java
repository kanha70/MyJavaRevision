package Experiment;

//break the k into increasing array


public class ForLoop {
    public static void main(String[] args) {
      int result = way(8,3);
        System.out.println(result);
    }

    private static int way(int total, int k) {
        int sum = 0;
        int []arr = new int[k];
        for (int i = 0;i<k;i++){
            arr[i] = i;
        }
        for (int i = 0; i< 5;i++)
            sum = i;
        return sum;
    }
}
