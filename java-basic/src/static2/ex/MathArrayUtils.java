package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //생성자에 private: 인스턴스 생성을 막는다.
        //문제에서 인스턴스 생성을 막는이유
        //어차피 멤버변수도 없는 클래스인데
        //객체를 생성하여 메서드를 사용하는건
        //메모리 낭비이기 때문에 막아놓는 것
        //좋은 제약
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
