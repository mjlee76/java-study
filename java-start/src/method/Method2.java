package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader(); // 반환 타입이 없기 때문에 변수에 String str = printHeader(); 이렇게 변수에 받지 않음.
        System.out.println("프로그램을 동작합니다");
        printFooter();
    }

    // 매개 변수가 없고, 반환 타입도 없는 경우(void)
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return; // void의 경우에는 생략가능
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
