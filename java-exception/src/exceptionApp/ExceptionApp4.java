package exceptionApp;

public class ExceptionApp4 {

    public static void main(String[] args) {
        int[] scores = {10, 20, 30};

        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(scores[3]);
            System.out.println(3);
            System.out.println(2 / 0);
            System.out.println(4);
        } catch (Exception e) {       //대부분 모든 예외의 부모인 Exception 사용
                                      //google에 "(검색할 예외) api java" 검색하여 부모 확인가능
            System.out.println("뭔가 이상합니다. 어떠한 예외가 발생했습니다.");
        }
        System.out.println(5);
    }
}
