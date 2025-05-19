package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자 입력:");
        int a = scanner.nextInt();
        System.out.println("두 번째 숫자 입력:");
        int b = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("두 숫자 사이의 모든 정수:");
        for (int i = a; i <= b; i++) {
            System.out.print(i);
            if (i != b) {
                System.out.print(", ");
            }
        }
    }
}
