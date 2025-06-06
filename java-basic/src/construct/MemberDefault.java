package construct;

public class MemberDefault {
    String name;

    MemberDefault() {
        System.out.println("생성자 호출");
        // 클래스 안에 아무 생성자가 없으면 클래스 명으로된
        // 이러한 빈 생성자가 자동으로 생김
        // 그래서 MemberDefault memberDefault = new MemberDefault(); 이게 가능한거임
    }
}
