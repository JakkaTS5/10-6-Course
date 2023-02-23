public class bai1 {
    public static void main(String[] args) throws Exception {
        /*
         * 1. Hiển thị số lần suất hiện của phần tử trong mảng. VD: int[] number =
         * . Xem output ảnh bên dưới.
         * 
         */
        int[] numbers = { 2, 5, 6, 8, 2, 5, 1, 9, 12, 11, 12, 15, 16, -9, -3, -3, 5, 1, 1, 12 };
        int count;
        for (int i = 0; i < numbers.length; i++) {
            count = 1;
            boolean check = true;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && j < i) {
                    check = false;
                }
                if (numbers[i] == numbers[j] && i != j) {
                    count++;
                }
            }
            if (check) {
                System.out.println("so lan xuat hien cua " + numbers[i] + " la " + count);
            }
        }
    }
}
