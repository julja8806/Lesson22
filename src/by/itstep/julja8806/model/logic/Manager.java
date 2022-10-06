package by.itstep.julja8806.model.logic;

import by.itstep.julja8806.model.data.Student;

public class Manager {
    public static double calcAvgStudentsMark(Student[] students) {
        double s = 0;
        for (Student student : students
        ){s+= student.mark;

        }
        return s / students.length;

    }
}
