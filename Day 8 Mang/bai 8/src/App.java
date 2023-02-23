import java.util.Arrays;

public class App {
    public static void mang1chieu() {
        // /*
        // * Mảng
        // * kieu_du_lieu [] ten_mang = {gia_tri, gia_tri,...}
        // * kích thước, độ dài của mảng sẽ không thể đổi
        // */
        // int[] numbers = { 1, 2 };// vị trí đầu sẽ là 0 và cuối cùng là length - 1
        // /*
        // * truy xuất phần tử của mảng
        // * ten_mang = new kieu[so luong phan tu]
        // */
        // int x = numbers[0]; // vị trí index
        // System.out.println(x);
        // /*
        // * khai báo mảng động
        // * ten_mang = new kieu[so luong phan tu]
        // */
        // int[] numbers1 = new int[4];
        // String[] names = { "an", "huong", "son" };
        // System.out.println("do dai cua mang " + names.length);// không phải length()
        // System.out.println(names[2]);
        // // phep gán vào mảng
        // names[0] = "minh";
        // System.out.println(names[0]);
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] numbers1 = new int[5]; // không chung reference, clonedeep
        for (int i = 0; i < numbers.length; i++) {// copy 2 mảng
            numbers1[i] = numbers[i];
        }
        for (int i = 0; i < numbers1.length; i++) {// in mảng kiểu thủ công
            System.out.print(numbers1[i]);
        }
        numbers[2] = 6;// gán dữ liệu vào mảng
        System.out.print(Arrays.toString(numbers));// in mảng kiểu mảng

    }

    public static void mang2chieu() {
        // còn dc gọi là ma trận
        /*
         * kieu_du_lieu [][] ten_mang;
         * kieu_du_lieu [][] ten_mang = new kieu_du_lieu [x][y] x là dòng, hàng, y là
         * cột,
         */
        // boolean [][] bools;
        int[][] matrix = {
                { 1, 2, 3 }, // để ý dấu phẩy
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // bools = new boolean[3][4];
        System.out.println(matrix[1][2]);
    }

    public static void duyetMang(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 }, // để ý dấu phẩy
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) { // chi căn length của dòng
                System.out.print(matrix[i][j] + " ");// i là dòng, j là cột
            }
            System.out.println();
        }
    }

    public static void baiTap1() {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                // nếu khai báo int trong for thì mỗi lần lặp sẽ tạo 1 sum mới >> lỗi
                sum += matrix[j][i];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        // mang1chieu();
        // mang2chieu();
        // duyetMang(args);
        baiTap1();
    }
}
