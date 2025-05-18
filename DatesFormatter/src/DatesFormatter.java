import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;

public class DatesFormatter {
    public static void main(String[] args) {
        Date currentDate = new Date();

        SimpleDateFormat dayofWeekFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek= dayofWeekFormat.format(currentDate);

        SimpleDateFormat dauOfMonthFormat = new SimpleDateFormat("d");
        String dauOfmonth = dauOfMonthFormat.format(currentDate);

        SimpleDateFormat MonthFormat = new SimpleDateFormat("MMMM");
        String month = MonthFormat.format(currentDate);

        System.out.println("Current Date of the Week: "+dayOfWeek);
        System.out.println("Date of the Month: "+dauOfmonth);
        System.out.println("Current Month: "+month);
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println(a + b + c);


        double priceCar = 10_000;

        if (priceCar > 8_000) {
            double oldPrice = priceCar;
            priceCar *= 0.95;
            System.out.println(oldPrice);
        }

        System.out.println(priceCar);

    }
}
