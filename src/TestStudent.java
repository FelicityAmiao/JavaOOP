import model.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("amiao", 20, "女", "3215004000");
        System.out.println("该学生的所有属性为：");
        System.out.println("学生姓名：" + student.getStudentName());
        System.out.println("年龄：" + student.getAge());
        System.out.println("性别：" + student.getSex());
        System.out.println("学号：" + student.getStudentNumber());
    }
}
