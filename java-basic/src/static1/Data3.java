package static1;

public class Data3 {
    public String name;
    public static int count; //static: 정적 변수 or 클래스변수 -> static 이 붙은 변수는 힙이 아닌 메서드 영역에서 관리함

    public Data3(String name) {
        this.name = name;
        count++;
    }
}