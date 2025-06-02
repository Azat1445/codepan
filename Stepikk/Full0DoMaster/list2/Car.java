package Full0DoMaster.list2;

public class Car {
    String color;
    String engine;
    int speed;

// Создаем метод газ и тело метода

    int gaz(int skorost) {
    speed += skorost;
    return speed;
    }

    //Создаем метод тормоз и тело метода

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo (){
        System.out.println("Color: " + color + " Engine: " + engine + " Speed: " + speed);
    }
}

    class Car2Test{
    public static void main(String[] args) {
        Car c1 = new Car();// Тип данных - Car c1 = вызов конструктора - new Car()
        c1.color = "red";
        c1.engine = "W12";
        c1.speed = 80;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(50) ;
        c1.showInfo();
    }
    }
