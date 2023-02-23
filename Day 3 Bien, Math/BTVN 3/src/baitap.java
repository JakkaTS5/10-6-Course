import java.time.LocalDateTime;

public class baitap {
    public static void main(String[] args) {
        // bài 1 tính tuổi
        LocalDateTime current = LocalDateTime.now();
        int yearNow = current.getYear();
        int yearBirthDay = 1993;
        int age = yearNow - yearBirthDay;
        System.out.println("so tuoi hien tai la " + age);
        // Bài 2 đổi đơn vị
        final int minute = 60;
        final int hour = 24;
        System.out.println("1 ngay co :" + minute * hour + " phut");
    }

}
