import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * tham số là biến cục bộ của phương thức nào đó, sẽ bị hủy khi phương thức hoàn
         * thành nhiệm vụ,
         * Tham só truyền vào
         */

        // int a = 1;
        // int b = 2;
        // System.out.println(isEven(a, b));// a b này dc gọi là đối số
        // add(1, 2, 3, 4, 5);

        /*
         * nhập từ bàn phím
         * scanner
         * nextint nextfloat next nextLine
         */

        // Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // System.out.println("so vua nhap la: " + a);
        // scanner.close();

        // nhập mảng 5 phần tử
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }
        System.out.println("mang " + Arrays.toString(numbers));
    }

    public static int isEven(int a, int b) {// nên có is. ab này gọi là tham số
        return a + b;

    }

    public static void add(float... args) {// ... là tự đưa vào mảng
        float sum = 0;
        for (float f : args) {
            sum += f;

        }

        System.out.println(sum);
    }
}
