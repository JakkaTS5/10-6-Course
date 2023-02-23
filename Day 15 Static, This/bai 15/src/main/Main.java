package main;

import entity.Cat;
import entity.Employee;

public class Main {
    static {
        System.out.println("khoi static");// chỉ cần hàm main, nhưng có thể hoạt động độc lập, chức năng giống hàm main
    }

    public static void main(String[] args) { // phuong thức static thì nó sẽ lưu giá trị đó, và không tạo mới, nó sẽ lấy
                                             // giá trị đó thực hiện tiếp.
        Employee e1 = new Employee(1, "Son");
        e1.display();// khi phương thức non Static thì phải gọi 1 biến e1 thì mới gọi dc phương thức
                     // display
    }

}
