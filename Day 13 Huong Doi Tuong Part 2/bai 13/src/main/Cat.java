package main;

import javax.sound.sampled.SourceDataLine;

public class Cat {
    private String name;// khi chuyến thành private thì chỉ cùng 1 class mới sử dụng được
    private int age; // intent
    private String color; // private thì phải đi cùng phương thức getter setter

    public String eat() {// phương thức
        return name + " is eating";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
