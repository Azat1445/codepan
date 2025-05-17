package Full0DoMaster;

public class dz3 {
    public static void main(String[] args) {
//        int i1=5;
//        int i2=11;
//         double d1=5.5;
//         double d2=1.3;
//         long L=20l;
//         double result1=0;
//         result1=i2/d1+d2%i2-L;
//         System.out.println(result1);

         int a=5;
         int b=8;
         int result2=0;
         int result3=0;
         result2=a-- - --a+ ++a+a++ +a; //5-3+4+4+5=15
         result3=++b - b++ + ++b - --b; //9-9+11-10=1
         System.out.println(result3);
        System.out.println(result2);
    }
}
