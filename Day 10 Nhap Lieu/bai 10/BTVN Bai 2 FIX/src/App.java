import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thu 1");
        int a = sc.nextInt();
        System.out.println("nhap so thu 2");
        int b = sc.nextInt();
        System.out.println("nhap so thu 3");
        int c = sc.nextInt();
        System.out.println("-----------------------");
        System.out.println(isCheck(a, b, c));
    }
    public static boolean isCheck(int a, int b, int c) {
        int maxNum = Math.max(c, Math.max(a, b));
        int minNum = Math.min(c, Math.min(a, b));
        int middleNum = a + b + c - maxNum - minNum;
        if ((maxNum - middleNum) == 1 && (middleNum - minNum) == 1) {// khoang cach = 1 >> liên tiếp
            return true;
        } else {
            return false;
        }
    }
}
