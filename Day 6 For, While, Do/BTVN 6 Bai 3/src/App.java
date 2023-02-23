public class App {
    public static void main(String[] args) {
        /*
         * 3. Xóa các ký tự trùng nhau trong một chuỗi và in ra màn hình kết quả (ví dụ:
         * actual string: "aabaabbbb" => expect string: "ab" )
         * hint : tạo 1 biến mới, so sánh biến mới vs các ký tự biến cũ, nếu khác thì
         * viết lại
         */
        // String str = "aabbbcbbaa";
        // String str1 = "";
        // for (int i = 0; i < str.length(); i++) {
        // if (!str1.contains(String.valueOf(str.charAt(i)))) {// phải đổi qua String
        // bằng valueOf
        // str1 += str.charAt(i);
        // }
        // }
        // System.out.print(str1);

        /*
         * cách 2 for
         * đặt ra 1 biến đúng sai
         */
        String str2 = "aabbbcbbaa";
        String str3 = "";
        for (int i = 0; i < str2.length(); i++) {
            boolean isExists = false;
            for (int j = 0; j < str3.length(); j++) {
                if (str2.charAt(i) == str3.charAt(j)) {
                    isExists = true;
                    break;
                }

            }
            if (isExists == false) {
                str3 += str2.charAt(i);
            }

        }
        System.out.println(str3);

    }
}
