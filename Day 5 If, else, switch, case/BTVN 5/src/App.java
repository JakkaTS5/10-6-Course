public class App {
    public static void main(String[] args) {
        /*
         * 1. Khai báo 1 biến và khởi tạo giá trị ban đầu lưu điểm của sinh viên, in ra
         * màn hình xếp loại trong đó >= 9 là giỏi, >=8 là khá giỏi, >=7 là khá, >=6 là
         * trung bình khá, <= 5 là trung bình
         * 
         */
        int diem = 7;
        if (diem >= 9) {
            System.out.println("gioi");
        } else if (diem >= 8) {
            System.out.println("kha gioi");
        } else if (diem >= 7) {
            System.out.println("kha");
        } else if (diem >= 6) {
            System.out.println("trung binh kha");
        } else if (diem <= 5) {
            System.out.println("trung binh");
        } else {
            System.out.println("khong dc xep loai");
        }
        /*
         * 2. Khai báo 1 số và khởi tạo giá trị ban đầu , kiểm tra số đó có phải số
         * chính phương không?
         */
        double x = 8;
        double y = Math.sqrt(x);
        double z = (y - Math.floor(y));
        if (z == 0) {
            System.out.println("la so chinh phuong");
        } else {
            System.out.println("khong phai so chinh phuong");
        }
        /*
         * 3. Khai báo 3 số a, b, c và khởi tạo giá trị ban đầu, kiểm tra 3 số đó có
         * phải 3 cạnh của tam giác không?
         */
        double a = 5, b = 7, c = 20;
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            System.out.println("la 3 canh tam giac");
        } else {
            System.out.println("khong phai 3 canh tam giac");
        }
    }
}
