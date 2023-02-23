package main;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * 4 tính chất của hướng đối tượng
         * 
         * Tính đóng gói Package
         * Tính kế thùa Extends
         * Tính đa hình
         * Tính trừu tượng
         */
        /*
         * Access Modifiers
         * Public
         * Protected
         * Default
         * Private
         */
        Cat tom = new Cat();
        // tom.name = "abc"; //khi bên kia chuyển private thì không thể lấy trực tiếp mà sử dụng getter setter
        // System.out.println("name :" + tom.name);
        String eat = tom.eat();// phương thức
        System.out.println(eat);
    }
}
