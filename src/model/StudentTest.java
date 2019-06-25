package model;

public class StudentTest {
    public  static void main(String [] args){
        Student stu=new Student("谢坤龙",22,1,"1505010112");
        System.out.println("姓名："+stu.getName());
        System.out.println("年龄："+stu.getAge());
        System.out.println("性别："+stu.getSex());
        System.out.println("学号："+stu.getNumber());
    }
}
