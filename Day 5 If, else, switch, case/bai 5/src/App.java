public class App {
    public static void main(String[] args) {
        // KEY WORD tham chiếu
        // Ctrl D là chọn all ký tự giống nhau
        // điều kiện if else
        /*
         * if(dieu_kien) {
         * câu lệnh muốn thực thi khi điều kiện đúng
         * }
         * else {
         * thực hiện khi điều kiện sai
         * }
         */
        int x = 9;
        if (x % 2 == 0) {
            System.out.println("X la so chan");
        } else {
            System.out.println("X la so le");
        }
        // toán tử 3 ngôi
        /*
         * variable = (condition) ? valueIfTrue : valueIfFalse
         */
        int a = 10;
        int b = 2;
        int c; // gọi là biến temp dùng để gán giá trị, chuyển đổi các giá trị
        if (a > b) {
            c = a;
            a = b;
            b = c;
        }
        System.out.println("gia tri cua a: " + a);
        System.out.println("gia tri cua b: " + b);
        // switch case
        int day = 4;
        switch (day) {
            case 2: {
                System.out.println("thu 2");
                break;
            }
            case 3:
                System.out.println("thu 3");
                break;
            case 4:
                System.out.println("thu 4");
                break;
            case 5:
                System.out.println("thu 5");
                break;
            default: // default phải là :
                System.out.println("sai");
        }
        float salary = 300;
        String lvl = salary <= 1000 ? "Fresher" : salary <= 2000 ? "middle" : salary > 2000 ? "senior" : "intern";
        System.out.println(lvl);
        // true && true = true dấu and
        // true && false = false
        // false && false = false

        // true || true = true dấu or
        // true || false = true
        // flase || flase = flase 

        // != là dấu khác
    }
}
