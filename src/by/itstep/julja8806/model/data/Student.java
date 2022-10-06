package by.itstep.julja8806.model.data;

public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;

    public Student (){
        String name = "No name";
        int age = 16;
        double mark = 4;
        boolean alive = true;



    }
    public String getInfo(){
        return name + ": age = " + age  + ", mark = " + mark + ", is alive = " + (alive ? "yes" : "no");
    }

}
