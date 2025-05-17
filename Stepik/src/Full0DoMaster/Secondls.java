package Full0DoMaster;

public class Secondls {
    public static void main(String[] args) {
        byte a = 12;
        byte b = 0b1100;
        byte c = 014;
        byte d = 0xC;
        System.out.println("Типы данных byte:"+a+" "+b+" "+c+" "+d);

        short e = 1300;
        short f = 0x514;
        short g = 02424;
        short h = 0b010100010100;
        System.out.println("Типы данных short: "+e+" "+f+" "+g+" "+h);

        int i1 = 0;
        int i2 = 0;
        int i3 = 0x0;
        int i4 = 0b0;
        System.out.println("Типы данных int: "+i1+" "+i2+" "+i3+" "+i4);

        long l1 = 123456789;
        long l2 = 0b111010110111100110100010101;
        long l3 = 0x75BCD15;
        long l4 = 0726746425;
        System.out.println("Типы данных long: "+l1+" "+l2+" "+l3+" "+l4);

        float f1 = 0.1f;
        float f2 = 0.2f;
        double d1 = 0.3;
        double d2 = 0.4;
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(f1+f2);
        System.out.println(d1+d2);
        System.out.println(b1);

        char c1 = 'a';
        char c2 = 52;
        System.out.println(c1);
        System.out.println(c2);
    }
}
