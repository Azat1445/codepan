package Full0DoMaster.TestsandDz;

public class Svetoaor {
    public static void main(String[] args) {
    // Отработка кода на switch
    String color = "blue";
        switch (color) {
        case "red":
            System.out.println("Стой");
            break;
        case "yellow":
            System.out.println("приготовься");
            break;
        case "green":
            System.out.println("Иди");
            break;
        default:
            System.out.println("Неизвестный сигнал");
            break;
        }
    }
}
