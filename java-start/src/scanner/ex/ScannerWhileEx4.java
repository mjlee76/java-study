package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;
        int option = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = input.nextInt();
            if (option == 1) {
                input.nextLine(); // 위에서 숫자만 가져가고 enter해결 안해주기 때문에 해당 코드로 엔터 읽어주기

                System.out.print("상품명을 입력하세요: ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매수량을 입력하세요: ");
                int quantity = input.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명:" + product + " 가격:" + price + " 수량:" + quantity + " 합계:" + quantity*price);

            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
