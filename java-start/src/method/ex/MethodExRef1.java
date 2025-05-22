package method.ex;

public class MethodExRef1 {
    public static void main(String[] args) {
        average(sum(1,2,3));
        average(sum(15,25,35));
    }

    public static int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static void average(int sum) {
        double result = sum / 3.0;
        System.out.println("평균값: " + result);
    }
}
