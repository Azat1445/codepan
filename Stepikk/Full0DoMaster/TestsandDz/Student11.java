package Full0DoMaster.TestsandDz;

public class Student11 {
        Student11 (int  id1, String name1, String lastName1, int yearStudy1, double greadMath1, double greadEconomic1, double greadEnglish1){
            id  = id1;
            name   = name1;
            lastName = lastName1;
            yearStudy = yearStudy1;
            greadMath = greadMath1;
            greadEconomic = greadEconomic1;
            greadEnglish = greadEnglish1;
        }
        Student11(int id2, String name2, String lastName2, int yearStudy2){
            this(id2, name2, lastName2, yearStudy2, 0.0, 0.0, 0.0);
        }
        Student11(){
            this(0, "", "", 0, 0.0, 0.0, 0.0);
        }
    int  id;
    String name;
    String lastName;
    int yearStudy;
    double greadMath;
    double greadEconomic;
    double greadEnglish;
}
class Student11Test{
    public static void main(String[] args) {
        Student11 st1 = new Student11(5,"Petr","Ivanov",2,3.16,4.22,5.46);
        System.out.println(st1.greadEconomic);

    }
}
