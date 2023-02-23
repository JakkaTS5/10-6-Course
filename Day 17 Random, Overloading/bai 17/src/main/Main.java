package main;

import java.util.Random;// xuất hiện package

import entity.Animal;

public class Main {
    public static void main(String[] args) {
        // Random random = new Random();
        // int num = random.nextInt(100);// random từ 0 - 99
        // float min = 2;
        // float max = 100;
        // Random random = new Random();
        // for (int i = 0; i < 100; i++) {
        // float num = min + random.nextFloat() * (max - min);// random ra số float
        // }

        // nạp chồng - overloading nạp chồng phương thức, cho phép các phương thức khác
        // nhau, cùng tên, cùng chức năng, nhưng khác về kiểu dữ liệu
        // System.out.println(sum(3, 2));
    // }

    // public static int sum(int a, int b) {
    //     System.out.println("kieu int");
    //     return a + b;
    // }

    // public static float sum(float a, float b) {
    //     System.out.println("kieu float");
    //     return a + b;
    // }

    // public static double sum(double a, double b) {
    //     System.out.println("kieu double");
    //     return a + b;

    /*tạo lớp kế thừa
     * class SubClassName extends SuperClassName{
     * method and fields
     * }
     */

    Animal animal = new Animal();
    Animal Cat = new entity.Cat();
    }
}
