import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * 1. Viết chương trình Java để kiểm tra xem một mảng số nguyên cho trước có độ
         * dài 2 có chứa 4 hoặc 7 hay không.
         * Original Array: [5, 7]
         * Output: true
         * 
         */
        int[] numbers = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 2 so tu ban phim");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] == 4 || numbers[i] == 7) {
                System.out.println("True");
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
