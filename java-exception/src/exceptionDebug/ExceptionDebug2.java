package exceptionDebug;

public class ExceptionDebug2 {

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
            System.out.println("뭔가 이상합니다. 어떠한 예외가 발생했습니다." + e.getMessage());
            e.printStackTrace(); //빨간색 메세지도 함께 보고싶다면 e.printStackTrace()메서드 사용
        }
        System.out.println(5);
    }
}
