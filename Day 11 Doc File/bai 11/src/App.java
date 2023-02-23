import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // đọc file
        File file = new File("input1.txt");// nhập theo địa chỉ file
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) { // nếu kiểu Int thì là hasNextInt 
                String w = scanner.nextLine();// nếu là next không thì cứ tìm đến khoảng trắng là in, String >> INT nếu đổi kiểu,
                System.out.println(w);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("sai roi");// xử lý biệt lệ
        }
    }

}
