package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 이 경우는 변수명이 다르기 때문에 this생략 가능(but, 사실 멤버변수 앞에 this가 있음)
    }
}
