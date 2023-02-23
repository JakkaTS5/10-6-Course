import java.time.LocalDateTime;// Để lấy ngày giờ hiện tại ta sử dụng phương thức now() trong class LocalDateTime: LocalDateTime.now()
import java.time.format.DateTimeFormatter;
class Main {
 public static void main(String[] args) {
    //khai báo đối tượng current thuộc class LocalDateTime
    LocalDateTime current = LocalDateTime.now();
    //sử dụng class DateTimeFormatter để định dạng ngày giờ theo kiểu pattern
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    //sử dụng phương thức format() để định dạng ngày giờ hiện tại rồi gán cho chuỗi formatted
    String formatted = current.format(formatter);
    //hiển thị chuỗi formatted ra màn hình
    System.out.println("Ngày giờ hiện tại: " + formatted);
 
  }
}