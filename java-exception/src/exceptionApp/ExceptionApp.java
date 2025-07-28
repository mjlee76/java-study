package exceptionApp;

public class ExceptionApp {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2/0); // 예외 상황 발생: 자바에선 0으로 나눌수 없음 -> ArithmeticException 발생
        System.out.println(3);
    }
}
