package ExceptionHandling;

public class CustomException {
    public static void main(String[] args) {

        try {
            throw new KanhaException("Trial");
        } catch (KanhaException e) {
            System.out.println(e);
        }
    }
}

class KanhaException extends Exception {
    String str;

    KanhaException(String args) {
        str = args;
    }

    public String toString() {
        return ("Exception found =" + str);
    }
}