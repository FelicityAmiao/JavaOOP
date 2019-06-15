package model;

public class Student {
    private String studentName;
    private int age;
    private String sex;
    private String studentNumber;

    public Student(String studentName, int age, String sex, String studentNumber) {
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
