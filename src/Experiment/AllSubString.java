package Experiment;

public class AllSubString {
    public static void main(String[] args) {
        String s = "Kanhaiya";
        subString(s,s.length());
    }

    private static void subString(String s, int length) {

        for (int i = 0; i < length; i++){
            for (int j=i+1; j <= length;j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
