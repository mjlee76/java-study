package checkedException;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

    //Exception 하위에는 RuntimeException과 IOException으로 나뉨
    //ArithmeticException, ArrayIndexOutOfBoundsException 등은 RuntimeException임
    //IOException은 반드시 예외 처리를 해야함.
    //안하면 컴파일 안됨 -> CheckedException

    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("data.txt");
            f.write("Hello");
            f.close(); //마지막 파일 닫기
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
