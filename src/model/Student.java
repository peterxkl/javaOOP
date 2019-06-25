package model;

public class Student {
    private  String name;
    private  int age;
    private  int sex;
    private  String number;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Student(String name, int age, int sex, String number) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.number = number;
    }
}
