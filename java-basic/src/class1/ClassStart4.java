package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // new Student() -> 참조값 x001생성 및 메모리공간 생성 -> student1의 주소: x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // new Student() -> 참조값 x002생성 및 메모리공간 생성 -> student2의 주소: x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; // new Student[2] -> 참조값 x005생성 및 메모리에 2개 공간을 생성 -> students 배열의 주소: x005
        students[0] = student1; // students[0] -> student1의 주소인 x001이 들어감
        students[1] = student2; // students[1] -> student2의 주소인 x002가 들어감

        // students[0].name -> x005[0].name -> x001.name -> "학생1"
        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        // students[1].name -> x005[1].name -> x002.name -> "학생2"
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}
