package extends1.overriding;

public class ElectricCar extends Car {

    @Override //부모의 기능을 자식이 새로 재정의(단, 부모의 메서드와 이름 동일해야함.) -> 메서드 오버라이딩
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
