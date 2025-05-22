package method;

public class Overloading1 {

    // 메서드 오버로딩
    // 이름이 같고 매개변수가 다른 메서드 여러개를 정의하는것을 뜻함.
    // 오버로딩은 번역하면 과적인데, 같은 이름의 메서드를 여러개 정의했다고 이해하면 됨.
    // 메서드의 이름이 같아도 매개변수의 타입 및 순서가 다르면 오버로딩을 할 수 있다. 참고로 반환타입은 인정하지 않는다.
    // 밑은 오버로딩 성공 사례
    // add(int a, int b)
    // add(int a, int b, int c)
    // add(double a, double b)

    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
