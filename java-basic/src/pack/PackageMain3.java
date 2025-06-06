package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        // 이름이 중복되지만 서로 다른 패키지에 있다면
        // 한개는 import가능, 한개는 직접 적어줘야 한다.

    }
}
