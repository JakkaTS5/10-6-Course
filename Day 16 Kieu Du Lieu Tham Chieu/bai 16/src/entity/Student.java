package entity;

public class Student {
    private int id;
    private String name;
    private String school;
    private String address;
    private School School;// tự tạo ra Kieu Dữ Liệu mới

    public Student(int id, String name, String school, String address) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.address = address;
    }

    public void display() {
        System.out.println(name);
    }
}
