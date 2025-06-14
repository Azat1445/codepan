package Full0DoMaster.TestsandDz;

public class DZZ {
    static void umnojenie (int i1, int i2, int i3) {
        int res = i1 * i2 * i3;
        System.out.println("Результат сложения трех чисел: "+res);
    }
    static void delenie(double d1, double d2) {
        double d = d1/d2;
        double dd =  d1%d2;
        System.out.println("Целая часть равна " + d + " остаток от деления равен " + dd);
    }
}
class DZZTest{
    public static void main(String[] args) {
        DZZ.umnojenie(10, 20, 30);
        DZZ.umnojenie(20,30,50);
        DZZ.delenie(10, 20);
        DZZ.delenie(20,30);

    }
}
