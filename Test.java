import java.util.ArrayList;
import java.util.Scanner;

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

class Teacher {
    private String id;
    private String name;

    public Teacher() {
        super();
    }

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void updateGpa(Student s, double gpa) {
        s.setGpa(gpa);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student() {
        super();
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
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

    public void input() {
        Scanner sc = new Scanner(System.in);
        this.id = sc.nextLine();
        this.name = sc.nextLine();
        this.gpa = sc.nextDouble();
        sc.nextLine();
    }
}
