package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("MyId", "kim");
        member.print();
        member.ChangeData("seo");
        member.print();
    }
}
