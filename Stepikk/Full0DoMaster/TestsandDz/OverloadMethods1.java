package Full0DoMaster.TestsandDz;

public class OverloadMethods1 {
    int a(){
        return 0;
    }
    int a(int s){
        return a(s,0,0,0);
    }
    int a(int s, int s1){
        return a(s,s1,0,0);
    }
    int a(int s, int s1, int s2){
        return a(s,s1,s2,0);
    }
    int a(int s, int s1, int s2, int s3){
        return s+s1+s2+s3;
    }
public static void main(String[] args) {
    OverloadMethods1 hw = new OverloadMethods1();
    System.out.println(hw.a());
    System.out.println(hw.a(1));
    System.out.println(hw.a(1,2));
    System.out.println(hw.a(1,2,3));
    System.out.println(hw.a(1,2,3,4));
}
}



