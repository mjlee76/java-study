package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        // int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화
        int[] students = {90, 80, 70, 60, 50}; // 한줄로 적으면 new int[] 도 생략 가능

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
