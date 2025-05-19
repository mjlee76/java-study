package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int n = scanner.nextInt();

        int[][] scores = new int[n][3];
        String[] subjects = {"국어", "영어", "수학"};
        int[] total = new int[n];
        double[] average = new double[n];
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            int sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
                sum += scores[i][j];
            }
            total[i] = sum;
            average[i] = (double) sum / 3;
        }

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번 학생의 총점: " + total[i] + ", 평균: " + average[i]);
        }
    }
}
