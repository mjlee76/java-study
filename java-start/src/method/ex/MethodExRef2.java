package method.ex;

public class MethodExRef2 {
    public static void main(String[] args) {
        String message = "Hello, World!";

        printHello(message, 3);
        printHello(message, 5);
        printHello(message, 7);
    }

    public static void printHello(String message, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(message);
        }
    }
}
