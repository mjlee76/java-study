package checkedException;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp2 {

    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("data.txt");
            f.write("Hello");
            //f.close();
            //close를 하기 전에 예외가 발생하면 close 실행 안됨
            //따라서, close는 finally로 처리!
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 만약에 f가 null이 아니라면
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
