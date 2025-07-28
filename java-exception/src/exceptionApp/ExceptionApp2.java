package exceptionApp;

public class ExceptionApp2 {

    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) { // ArithmeticException 발생 시 아래 코드 실행됨
            System.out.println("잘못된 계산이네요.");
        }
        System.out.println(3);

        System.out.println("=======================");

        int[] scores = {10, 20, 30};
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        try {
            System.out.println(scores[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("없는 값을 찾고 계시네요.");
        }

    }
}
