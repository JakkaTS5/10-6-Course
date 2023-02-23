import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // /*
        // * 2. Viết một phương thức Java chấp nhận ba số nguyên nhập từ bàn phím và
        // kiểm
        // * tra xem chúng có liên tiếp hay không. Trả về true hoặc false.(VD: 4,5,6 =>
        // * true; 5,4,6 => true; 6,4,5 => true; 1,2,4 => false)
        // *
        // */
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 3 so tu ban phim");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }
        Arrays.sort(numbers);
        if ((numbers[0] + numbers[1]) / 2 == numbers[2] || (numbers[0] + numbers[2])
                / 2 == numbers[1]
                || (numbers[1] + numbers[2]) / 2 == numbers[0]) {
            System.out.println("True");
        } else {
            System.out.println("so khong theo thu tu");
        }
        System.out.println(Arrays.toString(numbers));

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhap so thu 1");
        // int a = scanner.nextInt();
        // System.out.println("Nhap so thu 2");
        // int b = scanner.nextInt();
        // System.out.println("Nhap so thu 3");
        // int c = scanner.nextInt();
    }
}
