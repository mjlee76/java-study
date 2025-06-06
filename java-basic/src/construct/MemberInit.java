package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name; // 지역변수 name이 멤버변수 name보다 우선순위가 높다(더 안쪽에 있으므로)
        this.age = age;   // 따라서 우선순위가 낮은 name앞에 this를 붙여 해당 인스턴스의 멤버변수를 가르키도록함
        this.grade = grade; // 결국은, 변수명이 중복될 때 this를 사용하여 멤버변수를 잘 구분할수있게 해준다.
    }
}
