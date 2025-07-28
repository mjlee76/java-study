package exceptionApp;

public class ExceptionApp3 {

    public static void main(String[] args) {
        int[] scores = {10, 20, 30};

        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2 / 0);
            System.out.println(4);
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산입니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스 접근입니다.");
        }
        System.out.println(5);
    }
}
