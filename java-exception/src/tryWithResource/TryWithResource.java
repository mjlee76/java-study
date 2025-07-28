package tryWithResource;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        //try with resource statements
        //CheckedExceptionApp2.java 파일처럼 외부 resource(txt 등)에 접근할때
        //코드가 더러워 지는것을 해결해주는 예외처리 방법(Java7 이상)
        //try 다음 괄호에 close 할 대상을 넣어주면
        //close코드를 작성하지 않아도 저절로 close 됨
        // -> FileWriter 클래스는 AutoCloseable 인터페이스를 가지고 있음
        // -> AutoCloseable 인터페이스가 있다면 try with resource 문법 사용 가능

        try (FileWriter f = new FileWriter("data.txt");) {
            f.write("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
