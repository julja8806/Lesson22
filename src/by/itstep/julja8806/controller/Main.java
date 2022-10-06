package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.data.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 19, 10, true);
        Student student2 = new Student("Anna", 21, 4.8, true);
        Student student3 = new Student("Ben", 17, 8, true);
        Student student4 = new Student("Helena", 22, 5.6, true);

        Student student5 = new Student(student1);
        Student student6 = new Student(student2);
        Student student7 = new Student(student5);

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student4.getInfo());
        System.out.println(student5.getInfo());
        System.out.println(student6.getInfo());
        System.out.println(student7.getInfo());

    }
}
