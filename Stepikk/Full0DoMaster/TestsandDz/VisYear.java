package Full0DoMaster.TestsandDz;

public class VisYear {
    public static void main(String[] args) {
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год обычный");
        }
    }
}
