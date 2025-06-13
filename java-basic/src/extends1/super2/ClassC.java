package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10, 20);
        //부모인 ClassB에는 생성자가 이미 정의되어있기 때문에
        //ClassB에는 기본 생성자가 없다.
        //따라서 super();(기본생성자)는 사용 불가
        System.out.println("ClassC 생성자");
    }
}
