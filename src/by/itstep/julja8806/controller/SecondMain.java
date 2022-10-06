package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.data.Student;

public class SecondMain {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a = 20;


        Student student1 = new Student();
        Student student2 = student1;
        student1.name = "Alexandra";
    }
}
