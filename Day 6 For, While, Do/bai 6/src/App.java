public class App {
    public static void main(String[] args) {
        /*
         * vòng lặp for
         * for (khoi_tao; dieu_kien; buoc_nhay) {
         * noi dung can lap
         * }
         */
        // int i = 0;
        // for (; i < 10; i++) { // có thể viết kiểu này nhưng phải có ;
        // System.out.println(i);
        // }
        // double x = 1;
        // int n = 1;
        // for (n = 1; n < 6; n++) {
        // x += 1.0 / n;
        // }
        // System.out.println(x);
        /*
         * vòng lặp white biết trước số lần lặp
         */
        String str = "hello world";
        int i = 0;
        // while (i < str.length()) {
        // System.out.println(str.charAt(i));
        // i++;
        // }
        //while (str.charAt(i) != 'r') {//không phải là r là true, >> chạy, quan trọng làm sao để trả về true để hàm chạy
        //    System.out.println(str.charAt(i));
        //    i++;
        //}
        /*
         * vòng lặp do while
         * do {
         *      nội dung của lặp
         * }while (dieu_kien)
         */
        do {
            System.out.println(str.charAt(i));
            i ++;
         } while (str.charAt(i) == 'r'); // >> mới vào H khong phải r >>  false không làm
        
         

    }
}
