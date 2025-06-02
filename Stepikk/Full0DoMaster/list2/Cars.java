package Full0DoMaster.list2;

public class Cars {
    void Cars(String cvet, String motor){
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: "+color);
        System.out.println("Мотор: "+engine);
    }

    String color;
    String engine;
}

class Carstest {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Cars car2 = new Cars();
//        int a;
//        Cars car1 = new Cars();
//        car1.color = "red";
//        car1.engine = "bmw";
//
//        System.out.println("Color: " + car1.color);
//        System.out.println("Engine: " + car1.engine);

    }
}