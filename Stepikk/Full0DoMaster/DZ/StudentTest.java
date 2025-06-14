package Full0DoMaster.DZ;
import Full0DoMaster.DZ.Student;

public class StudentTest {
    void max(int a, int b, int c) {
        if (a > b && a>c) {
            System.out.println("Max: " + a);
        } else if (b > a && b>c) {
            System.out.println("Max: " + b);
        } else {
            System.out.println("Max: " + c);
        }
    }
    void abc() {
        String str;
        int a = 5;
        if (a >= 10) {
            str = "Hello";
        }
        if (a < 1) {
            str = "Dood bue";
        } else {
            str = null;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        StudentTest st = new StudentTest();
        st.max(5,6,8);
    }
}
class StudentTestTest{
    public static void method_2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            System.out.println("Имена студентов равны");
        } else {
            System.out.println("Имена студентов не равны");
        }if(st1.course==(st2.course)) {
            System.out.println("Курс у студентов одинаковый");
        }else {
            System.out.println("Курс у студентов не одинаковый");
        } if (st1.grade==(st2.grade)) {
            System.out.println("Оценка у студентов одинакова");
        } else {
            System.out.println("Оценка у студентов не одинакова");
        }
    }
        public static boolean equals(Student st2, Student st1){
            boolean res;
            if((st1.name.equals(st2.name))&&(st1.grade==st2.grade)&&(st1.course==st2.course)){
                res=true;
            }
            else {res=false;}
            return res;
        }
    public static void method_1(Student st1, Student st2){
        if(equals(st2,st1)){
            System.out.println("Студенты равны!");
        }
        else{System.out.println("Студенты не равны!");}
    }
    public static void main(String []args){
        Student student1 = new Student("Марк",4,5);
        Student student2 = new Student("Марк",2,3);
        method_2(student1,student2);
        method_1(student2,student1);
    }
}