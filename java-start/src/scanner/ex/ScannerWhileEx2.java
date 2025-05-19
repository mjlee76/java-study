package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력 (-1 입력시 종료): ");
            int price = input.nextInt();
            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("상품의 수량을 입력: ");
            int quantity = input.nextInt();

            System.out.println("총 비용: "+price*quantity);
            input.nextLine();
        }
    }
}
