import java.nio.channels.Pipe;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // 3 loại biến: biến cục bộ, biến instance, static
        // cú pháp : kieu_du_lieu danh_sach_bien
        int a = 0, b = 1, c = 3; // dấu namisen của b nghĩa là chưa sử dụng b
        System.out.println(a);
        System.out.println(c);
        // nên khởi tạo biến cục bộ, vì nếu không sẽ xảy ra lỗi (gán giá trị)
        boolean e = false;

        /*
         * quy tắc đặt tên
         * 1. bắt đầu bằng 1 chữ cái, _, $, không chứa ký tự đặc biệt !@%... gọi là lỗi "syntax"
         * 2. không thế dặt khoảng trắng giữa các ký tự
         * 3. không đặt tên trùng vs keyword vd integer, bloolean...
         * 4. trong 1 phương thức, không thế khai báo 2 biến cùng 1 tên
         */
        final Float PI = 3.1415f; //final là hằng số, thay đổi, gán là sẽ báo lỗi
        int r = 5;
        float area = PI * r * r;
        System.out.println(area);
    }
}
