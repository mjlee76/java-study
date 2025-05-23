package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; // 학생1의 정보를 담을 변수 student1선언
        student1 = new Student(); // 메모리에 학생(클래스)공간을 만듬
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 타입은 데이터의 종류나 형태를 나타낸다.
        // int라고 하면 정수 타입, String이라고 하면 문자 타입이다.
        // 학생(Student)이라는 타입을 만들면 되지 않을까?
        // 클래스를 사용하면 직접 타입을 만들 수 있다.
        // 사용자 정의 타입을 만들려면 설계도가 필요함 -> 이 설계도가 클래스이다.
        // 설계도인 클래스를 이용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
        // 클래스를 통해서 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있다.
        // 여기에서는 학생(Student)클래스를 기반으로
        // 학생1(student1), 학생2(student2) 객체 또는 인스턴스를 만들었다.

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
