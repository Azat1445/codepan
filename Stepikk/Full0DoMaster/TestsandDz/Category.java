package Full0DoMaster.TestsandDz;

public class Category {
    public static void main(String[] args) {
//        Отработка кода на if else

        int age = 20;
         if (age < 4) {
             System.out.println("Младенец - бесплатно");
         } else if (age >= 4 && age < 12) {
             System.out.println("Детский билет");
         } else if (age >= 13 && age < 17) {
             System.out.println("Подростковый билет");
         } else if (age >= 60){
            System.out.println("Пенсионный билет (скидка 50%)");
        } else {
             System.out.println("Взрослый билет");
         }

    }
}
