import java.util.Scanner;

public class ToanTuDieuKien {// phải là tên file
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam");
        int year = scanner.nextInt();
        scanner.close();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Nam Nhuan");

        } else {
            System.out.println("khong phai nam nhuan");
        }
    }
}