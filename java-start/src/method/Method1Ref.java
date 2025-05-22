package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(1, 2);
        System.out.println("결과1 출력: " + sum1);

        // 계산2
        int sum2 = add(10, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

    // public static
    // public: 다른 클래스에서 호출할 수 있는 메서드라는 뜻. 접근 제어에서 학습
    // static: 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻이다. 뒤에서 학습

    // int add(int a, int b)
    // int: 반환 타입을 정의한다. 메서드의 실행 결과를 반환할 때 사용할 반환 타입을 지정한다.
    // add: 메서드에 이름을 부여한다. 이 이름으로 메서드를 호출할 수 있다.
    // (int a, int b): 메서드를 호출할 대 전달하는 입력 값을 정의한다. 이 변수들은 해당 메서드 안에서만 사용된다. 이렇게
    // 메서드 선언에 사용되는 변수를 영어로 파라미터(parameter), 한글로 매개변수라 한다.

    // 메서드 본문
    // 메서드가 수행해야하는 코드블록
    // 메서드를 호출하면 메서드 본문이 순서대로 실행된다.
    // 메서드 본문은 블랙박스이다. 메서드를 호출하는 곳에서는 메서드 선언은 알지만 메서드 본문은 모른다.
    // 메서드의 실행 결과를 반환하려면 return 문을 사용해야 한다. return문 다음에 반환할 결과를 적어주면 된다.

    // 용어 정리
    // 인수(Argument): 메서드를 호출할때 들어가는 값들을 의미함. add("hello", 10)에서 "hello"와 10을 의미함.
    // 매개변수(Parameter): 메서드를 정의할 때 선언하는 변수인 String str, int age 등이 매개변수이다. 메서드 호출부와 내부
    // 사이에서 값을 전달하는 변수라는 뜻이다.
}
