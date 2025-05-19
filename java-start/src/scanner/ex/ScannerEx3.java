package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("음식 이름 입력:");
        String foodName = input.nextLine();
        System.out.println("음식의 가격 입력:");
        int foodPrice = input.nextInt();
        System.out.println("음식의 수량 입력:");
        int foodQuantity = input.nextInt();

        System.out.println(foodName + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + (foodPrice * foodQuantity) + "입니다.");

    }
}
