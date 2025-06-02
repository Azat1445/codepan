package Full0DoMaster.TestsandDz;

public class Povar {
    int sum(int a, int b, int c) {
        int result = a + b + c;

        return result;
    }
}
class Povar1{
    public static void main(String[] args) {
        Povar p = new Povar();
        int sum123= p.sum(1, 3, 2);
        System.out.println(sum123);
        System.out.println(p.sum(5, 6, 9));
    }
}
