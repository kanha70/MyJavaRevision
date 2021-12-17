package New;

public class Que1 {
    public static void main(String[] args) {

        String input = "1034567890";
        String number = input.replaceFirst("(\\d{2})(\\d{3})(\\d+)","$1-$2-$3");
        System.out.println(number);
    }
}
