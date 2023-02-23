package entity;

public class NhanVien {
    private int id;
    private String name;
    private int age;
    private int lvl;
    private double salary;

    public NhanVien(int id, String name, int age, int lvl, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.lvl = lvl;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getSalary() {
        if (lvl == 1) {
            salary = (salary * 0.9) + 500;
        }
        if (lvl == 2) {
            salary = (salary * 0.9) + 1000;
        }
        if (lvl == 3) {
            salary = (salary * 0.9) + 1500;
        }
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
