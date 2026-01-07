import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("vgs1422", "Nguyen Van A", 3.7);
        Student student1 = new Student("vgs1444", "Nguyen Van B", 3.3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        for (Student studentTmp : students) {
            studentTmp.displayStudentInfor();
            System.out.println("---------------");
        }

    }
}

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student() {
        super();
    }

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public void displayStudentInfor() {
        System.out.println("Id : " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Gpa: " + this.gpa);
    }
}
