public class App {
  public static void main(String[] args) {
    /*
     * 1. Viết chương trình khởi tạo 1 chuỗi bất kì, sử dụng vòng lặp để đảo ngược 1
     * chuỗi
     */
    String str = "hello world";
    String str1 = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      str1 += str.charAt(i);
    }
    System.out.println(str1);// cách này gán thành 1 biến mới và chỉ in
    // cách tự làm
    String chuoi = "viet Nguoc";
    int a = chuoi.length() - 1;
    while (a >= 0) {
      System.out.print(chuoi.charAt(a));// cách này thì chạy ra từng ký tự, nên phải xếp cùng hàng
      a--;
    }
    /*
     * 2. Viết chương trình khởi tạo 1 chuỗi bất kì, sau đó đếm và hiển thị số lần
     * xuất hiện của ký tự 'a' trong chuỗi đó
     * 
     */
    String str2 = "aabbbccb";
    int count = 0;
    for (int j = 0; j < str2.length(); j++) {
      if (str2.charAt(j) == 'b') {
        count++;
      }
    }
    System.out.println("so luong chu b la: " + count);

  }
}
