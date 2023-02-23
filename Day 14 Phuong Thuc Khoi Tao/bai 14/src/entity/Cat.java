package entity;

public class Cat {
    private String name;
    private int age;

    /*
     * phuong thức khởi tạo
     * không có kiểu trả về, giống vs tên class;
     * 2 loại: Không tham số(mặc dịnh của một class)
     * tên giống tên class
     * khổi tạo ra các thuộc tính, phương thức thực hiện hành động
     * 
     * khi sữ dụng intern muốn khởi tạo ra giá trị mới, khi sd khởi tạo sẽ ko cần setter
     * còn setter thì không biết dc giá trị, và muốn cập nhật thay đổi
     */
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // public void setName(String name) {
    // this.name = name;
    // }

}
