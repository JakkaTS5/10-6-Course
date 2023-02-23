package main;

import entity.NhanVien;

public class Main {//tên class nên ghi hoa chữ đầu
    public static void main(String[] args) {
        NhanVien son = new NhanVien(1111, "Son", 29, 4, 3000);
        System.out.println("ID: " + son.getId());
        System.out.println("Name: " + son.getName());
        System.out.println("Agme: " + son.getAge());
        System.out.println("Level: " + son.getLvl());
        System.out.println("Salary: " + son.getSalary());
    }
}
