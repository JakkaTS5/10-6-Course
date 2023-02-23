public class Compare {
    public static void main(String[] args) throws Exception {
        int a = 100;
        int b = 100;
        // System.out.println("a < b ? " + (a < b));
        System.out.println(a == b);// so sánh bằng
        System.out.println(a != b);// so sánh khác
        // phép gán
        a = a + 2;// giống a += 2
        System.out.println(a);
        // Postfix vs Prefix
        int x = 8;
        int y = 3;
        int z = ++x - y++ + 5;
        System.out.println(z);
        // bước 1 x sẽ tăng 8 + 1 = 9
        // bước 2 z = 8 - 3 + 5
        // bước 3 z = 11
        // bước 4 y tăng 3 + 1 = 4
        int xx = 8;
        int yy = 3;
        int zz = ++xx - ++yy + 5;
        // Bước 1 cả xx và yy đều tăng lên 1 ( xx = 8 + 1, yy = 3 + 1)
        // Bước 2 zz = 9 - 4 + 5
        // Bước 3 zz = 10
        System.out.println(zz);
        // Ép kiểu, cú pháp (kieu_du_lieu) ten_bien
        // float aa = 10.5f;
        // float bb = 2
        // int cc = (int) aa /bb; lỗi
        // System.out.println(cc);
        char d = 'Z';
        char e = 'b';
        int f = (int) e - (int) d;
        System.out.println(f);
        // kiễu dữ liệu String
        String chuoi = "Chao Cac Ban";
        System.out.println(chuoi);
        int doDai = chuoi.length();
        System.out.println(doDai);
        System.out.println(chuoi.toLowerCase());
        String g = "H";
        String h = "h";
        String j = g.toLowerCase();
        System.out.println(g == h);
        System.out.println(j == h);
        System.out.println(chuoi.contains("ac"));// trả và true nếu chuỗi có trong chuỗi
        System.out.println(chuoi.indexOf("a"));// vị trí của ký tự trong chuỗi
        System.out.println(chuoi.charAt(doDai - 1));// tìm vị trí của ký tự thứ ... trong chuỗi
        String u = "hello ";
        String i = "\"world \n cho nay xuong dong";// gõ ký tự dặc biệt phải có \, \n
        System.out.println(u + i);
        System.out.println(u + a + b); // cộng chuỗi
        System.out.println(u + (a + b));// sẽ cộng a vs b
        //Math
        //Math.round() làm tròn lên
        //Math.floor() làm tròn xuống
        //Math.ceil() làm tròn đơn vị
    }
}
