import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        /*
         * 2. Viết phương thức trả về giá trị, phương thức isVowel trả về giá trị true
         * nếu một ký tự đã cho là nguyên âm và nếu không thì trả về giá trị false.
         * Trong phương thức main () khởi tạo 1 chuỗi và đếm số nguyên âm trong chuỗi
         * đó.
         * 
         */
        String str = "hello world";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }

    // public static boolean baiTap1(int[] numbers) {
    // return number % 2 == 0;
    // }

    public static boolean isVowel(char letter) {
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            return true;
        } else {
            return false;
        }
    }

}
