package Full0DoMaster.list2;

public class test1 {
    //метод
    int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;

        //Тело метода
    }

    int srAr(int a1, int b1, int c1) {
        int result2 = sum(a1, b1, c1)/3;
    return result2;
    }
}
    class test2{
        public static void main(String[] args) {
            test1 tt = new test1();
            int summaTrexChisel = tt.sum(2, 3, 4);
            System.out.println(summaTrexChisel);
            System.out.println(tt.sum(20, 7, 5));
            System.out.println(tt.srAr(20,40,60));
        }
    }
