package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2; // temp는 if문 안에서만 사용하므로 if문안에 int temp = m * 2 로 선언하는게 좋다(메모리 낭비, 코드 복잡성 증가)
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
