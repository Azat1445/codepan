package Full0DoMaster.TestsandDz;

public class Dz {
    public static void main(String[] args) {
        int score = 50;

        if (score >= 90 && score <=100) {
            System.out.println("Отлично");
        } else if (score >= 75 && score <=89) {
            System.out.println("Хорошо");
        } else if (score >= 60&& score <= 74){
            System.out.println("Удовлетворительно");
        } else{
            System.out.println("Неудовлетворительно");
        }
    }
}