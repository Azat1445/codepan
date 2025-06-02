package Full0DoMaster.list2;

public class Student {
    int  id;
    String name;
    String lastName;
    int yearStudy;
    double greadMath;
    double greadEconomic;
    double greadEnglish;
    void averageGrade(Student s){
        double result = (s.greadMath + s.greadEconomic + s.greadEnglish)/3;
        System.out.println("Средней оценкой является" + result);
    }
}
 class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id =237;
        s1.name ="John";
        s1.lastName ="Smith";
        s1.yearStudy = 3;
        s1.greadMath = 3.14;
        s1.greadEconomic = 2.78;
        s1.greadEnglish = 5.08;

        s2.id =237;
        s2.name ="Mike";
        s2.lastName ="Anderson";
        s2.yearStudy = 1;
        s2.greadMath = 4.67;
        s2.greadEconomic = 4.89;
        s2.greadEnglish = 2.47;

        s3.id =147;
        s3.name ="Petr";
        s3.lastName ="Swarovski";
        s3.yearStudy = 3;
        s3.greadMath = 4.22;
        s3.greadEconomic = 3.74;
        s3.greadEnglish = 4.25;

        s1.averageGrade(s1);
        s2.averageGrade(s2);
        s3.averageGrade(s3);

//        double result1 = 0;
//        double result2 = 0;
//        double result3 = 0;
//
//        result1 = (s1.greadMath + s1.greadEconomic + s1.greadEnglish)/3;
//        result2 = (s2.greadMath + s2.greadEconomic + s2.greadEnglish)/3;
//        result3 = (s3.greadMath + s3.greadEconomic + s3.greadEnglish)/3;
//        System.out.println(result1);
    }
 }