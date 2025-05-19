package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3]; // 행2, 열3

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for (int row = 0; row < arr.length; row++) { // arr.length -> 행의 갯수
            for (int col = 0; col < arr[row].length; col++) { // arr[row].length -> 열의 갯수
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
