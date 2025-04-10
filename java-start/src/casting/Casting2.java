package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 형변환: 큰걸 작은걸로 형변환시 명시해줘야함(int)
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
