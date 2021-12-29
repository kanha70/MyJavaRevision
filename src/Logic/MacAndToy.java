package Logic;

import java.util.Arrays;

public class MacAndToy {
    public static void main(String[] args) {
        int [] price = {1,3,4,5,2};
        int k = 9;
        int result = maxToy(price,k);
        System.out.println("Maximum number of Toys He Can Afford is : "+result);
    }

    private static int maxToy(int[] price, int k) {
        int max_toy = 0;
        Arrays.sort(price);
        if (price.length == 0 || k == 0 ) return max_toy;
        for (int i = 0; i<price.length; i++){
            k-= price[i];
            if (k < 0){
                max_toy = i;
                break;
            }
        }
        return max_toy;
    }
}
