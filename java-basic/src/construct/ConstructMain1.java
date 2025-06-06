package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        // 객체를 생성하는 동시에, 생성자를 불러야함 -> 매개변수 넣어줘야함.
        // 생성자의 가장 큰 장점임.
        // 결국 매개변수를 넣지 않으면 오류가 발생한다는건 -> 유령 멤버(회원)을 원천 차단 가능하다는 것.
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user1", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:"+member.name+" 나이:"+member.age+" 성적:"+member.grade);
        }
    }
}
