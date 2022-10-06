package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.data.Student;
import by.itstep.julja8806.model.logic.Manager;

public class Controller {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 20, 5.0, true);
        Student student2 = new Student("Alex", 20, 6.0, true);
        Student student3 = new Student("Alex", 20, 7.0, true);

        Student[] students = {student1, student2, student3};
        double result = Manager.calcAvgStudentsMark(students);

        System.out.printf("Average student's marks is %.2f", result);
    }
}
