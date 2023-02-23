package entity;

public class Employee {
    private int no;
    private String name;
    private static String companyName;

    public Employee(int no, String name) {
        /*
         * ý nghĩa của this
         * để gọi các phương thức khởi tạo
         * khi tham số truyền vào trùng tên giá trị mặc định thì phải dùng this
         * 
         */
        this.no = no;
        this.name = name;
        this.display(); // sử dụng this như này cũng dc
    }

    public void getName() {// static chỉ gọi dc static
        System.out.println(companyName);
        System.out.println(name);
    }

    public void display() {// phương thức non staic >> hàm main phải tạo biến mới
        System.out.println(no + " - " + name + " - " + companyName);
    }
}
