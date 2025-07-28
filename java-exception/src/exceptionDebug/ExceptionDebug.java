package exceptionDebug;

public class ExceptionDebug {

    public static void main(String[] args) {
        int[] scores = {10, 20, 30};

        System.out.println(1);
        try {
            System.out.println(2);
            //System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2 / 0);
            System.out.println(4);
        } catch (Exception e) {
            //System.out.println("뭔가 이상합니다. 어떠한 예외가 발생했습니다.");
            //예외 발생 시 위의 출력문을 디버깅 하여 변수 e 안의 detailMessage를 확인하여 오류 확인 가능
            //또는 출력 뒤에 e.getMessage() 메서드를 붙여 오류 확인도 가능
            System.out.println("뭔가 이상합니다. 어떠한 예외가 발생했습니다." + e.getMessage());
        }
        System.out.println(5);
    }
}
