package main;

import entity.Student;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Son", "a", "b");
        Student st2 = new Student(2, "Hieu", "c", "d");
        Student st3 = new Student(2, "Hung", "c", "d");
        st1.display();
        Student students[] = new Student[3]; // tạo mảng theo Kieu dự liệu tạo mới
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        students[0].display();
    }

}
