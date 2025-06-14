package Full0DoMaster.DZ;

public class Student {
    String name;
    int course;
    double grade;
    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap(Student s1, Student s2) {
        Student s3=s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);
    }
    public static void changeName(Student s1) {
        s1.name = "Oleg";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Petr", 2, 3);
        Student s2 = new Student("Jack", 4, 5);
        changeName(s2);
        System.out.println(s2.name);
    }
}
