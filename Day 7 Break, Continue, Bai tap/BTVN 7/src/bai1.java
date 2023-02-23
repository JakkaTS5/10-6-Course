public class bai1 {
    public static void main(String[] args) {
        /*
         * 1. Tạo một chương trình để in các số chẵn từ 10 đến 20 bỏ qua số 16, theo 3
         * cách khác nhau:
         * - tăng 2 trong mỗi bước (sử dụng continue)
         * - Tăng 1 trong mỗi bước (sử dụng continue)
         * - dùng vòng lặp vô tận (sử dụng "break", "continue")
         */
        for (int i = 10; i <= 20; i += 2) {
            if (i == 16) {
                continue;
            }
            System.out.println(i);
        }
        for (int i = 10; i <= 20; i++) {
            if (i % 2 != 0 || i == 16) {
                continue;
            }
            System.out.println(i);
        }
        for (int i = 10; true; i++) { // true là hàm vô tận
            if (i % 2 != 0 || i == 16) {
                continue;
            } else if (i > 21) {
                break;
            }
            System.out.println(i);
        }
    }
}
