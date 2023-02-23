import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class bai2 {
    public static void main(String[] args) {
        /*
         * Bài 2: Viết hoa chữ cái đầu tiên của chuỗi và các kí tự đầu tiên trước khoảng
         * trắng, ví dụ: "nguyễn thanh Tùng" => "Nguyễn Thanh Tùng"
         */
        String str = "nguyen thanh tung"; // tách ra từng chuỗi, và lấy vị trí đầu tiên
        String[] arr = str.split(" ");// căt ra thành chuỗi
        String result = "";
        System.out.println(Arrays.toString(arr));// test
        for (String string : arr) {
            String firstLetter = string.substring(0, 1);// lấy ra ký tự đầu tiên
            result += firstLetter.toUpperCase() + string.substring(1, string.length()) + " ";//viết hoa ký tự đầu và + lại vào chuỗi
        }
        System.out.println(result);
    }
}
