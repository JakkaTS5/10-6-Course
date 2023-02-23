import java.util.Arrays;
import java.util.concurrent.Flow.Subscription;

public class bai1 {
    public static void main(String[] args) throws Exception {
        /*
         * Bài 1: Viết một chương trình để kiểm tra xem hai chuỗi có phải là đảo chữ của
         * nhau hay không. Đảo chữ có cùng độ dài và chứa cùng một ký tự, nhưng theo thứ
         * tự khác nhau, ví dụ: "Army" và "Mary" là đảo chữ. Chương trình của bạn sẽ trả
         * về true nếu cả hai Chuỗi là đảo chữ, ngược lại là false.
         */
        String str = "Army";
        String str1 = "Mary";
        char[] arr = str.toLowerCase().toCharArray();// chuyển đổi về mảng ký tự
        char[] arr1 = str1.toLowerCase().toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(Arrays.equals(arr,arr1));
        // System.out.println(str1.substring(0, 2) + str1.substring(3));// bỏ số 2 chữ r

    }
}
