package method;

public class MethodValue2 {

    // @@@ 자바 대원칙 @@@
    // 자바는 항상 변수의 값을 복사해서 대입한다.

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); // 이 값이 뭐가 나올까요?
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number: " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number: " + number);
    }
}
