package com;
public class Homework {
    private int id;
    private String name;
    private int age;
    private double grade;
    private static int totalStudents = 0;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = 0.0;
        totalStudents++;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setGrade(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        this.grade = sum / grades.length;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void printTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "John", 20);
        Student student2 = new Student(2, "Emma", 19);
        Student student3 = new Student(3, "Michael", 21);

        student1.setGrade(80.5);
        student2.setGrade(new double[]{85.0, 87.5, 90.0});
        student3.setGrade(new double[]{75.0, 70.0});

        printTotalStudents();
    }
}
