public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1: Hiển thị bài thơ bằng 1 lần in
         * Tôi yêu em: đến nay chừng có thể
         * Ngọn lửa tình chưa hẳn đã tàn phai
         * Nhưng không để em bận lòng thêm nữa
         * Hay "hồn em phải gợn bóng u hoài".
         */
        System.out.println(
                "Tôi yêu em: đến nay chừng có thể \n Ngọn lửa tình chưa hẳn đã tàn phai\nNhưng không để em bận lòng thêm nữa\nHay \"hồn em phải gợn bóng u hoài\".");
        /*
         * 2: Làm quen Math class và tính :
         * + sin, căn bậc 2 của 1 số,
         * + tính trị tuyệt đối của 1 số
         * + random số ngẫu nhiên
         * + tính max min của 2 số kiểu float, double
         */
        int a = 9;
        int b = -6;
        int goc = 30;
        double x = 15.2;
        float y = 0.15f;
        double radian = Math.PI * goc / 180;
        System.out.println("can bac 2 cua " + a + " la " + Math.sqrt(a));
        System.out.println("sin(" + goc + ") la " + Math.sin(radian));
        System.out.println("gia tri tuyet doi cua " + b + " la " + Math.abs(b));
        System.out.println(Math.random());
        System.out.println(Math.max(x, (double) y));
        System.out.println(Math.min(x, (double) y));

    }
}
