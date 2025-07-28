package throwException;

import java.io.FileWriter;
import java.io.IOException;

public class ThrowException {

    // 여기서 예외처리를 하지 않고 이 코드를 사용할 다음 사용자(객체)에게 예외처리를 넘겨버림
    // throws + 처리해야 할 예외 작성
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("./data.txt");
    }
}
