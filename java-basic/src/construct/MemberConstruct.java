package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 생성자의 이름은 클래스 이름과 같아야함. 첫글자도 대문자로 시작
    // 생성자는 반환 타입이 없다. 비워두어야 한다.
    // 나머지는 메서드와 같다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name="+name+" ,age="+age+" ,grade="+grade);
        this.name = name;
        this.age = age;
        this.grade =grade;
    }

    //추가
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        this(name, age, 50); // 위의 3줄을 이렇게 줄이기 가능(자기 자신의 생성자 호출을 통해)
        // 하지만 이방법은 생성자의 가장 첫줄에 작성해야만 가능
    }
}
