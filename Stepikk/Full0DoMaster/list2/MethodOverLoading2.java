package Full0DoMaster.list2;

public class MethodOverLoading2 {
    int sum(int a, int b) {
        return a + b;
    }
    String sum(String a, String b) {
        return a + b;
    }
}
class MethodOverLoading2Test{
    public static void main(String[] args) {
        MethodOverLoading2 mO2 = new MethodOverLoading2();
        int a = mO2.sum(1, 2);
        System.out.println(a);
        String s = mO2.sum("Hello", " my friend");
        System.out.println(s);
    }
}