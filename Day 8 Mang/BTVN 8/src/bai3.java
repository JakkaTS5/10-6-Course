import java.util.Arrays;

public class bai3 {
    public static void main(String[] args) {
        /*
         * 3. Cho 1 matrix 6x6, xóa đi dòng có tổng lớn nhất. VD:
         * int[][] matrix = {
         * {1,2,3,11,13,14},
         * {4,5,6,12,13,14},
         * {7,8,9,13,13,14},
         * {2,5,6,12,13,14},
         * {1,5,6,12,13,14},
         * {3,5,6,12,13,14}
         * };
         * 
         */
        int[][] matrix = {
                { 1, 2, 3, 11, 13, 14 }, // 44
                { 4, 5, 6, 12, 13, 14 }, // 54
                { 7, 8, 9, 13, 13, 14 }, // 64
                { 2, 5, 6, 12, 13, 14 }, // 52
                { 1, 5, 6, 12, 13, 14 }, // 51
                { 3, 5, 6, 12, 13, 14 }// 53
        };
        int [][] matrix1 = new int [6][6];
        int sum;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(maxtrix[][]));
    }
}
