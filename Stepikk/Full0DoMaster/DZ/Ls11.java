package Full0DoMaster.DZ;

public class Ls11 {

}
class Car{
    String color;
    String model;
    int numdur;

    public Car(String color, String model, int numdur) {
        this.color = color;
        this.model = model;
        this.numdur = numdur;
    }
}

class CarTest{

    void numnum(Car c, int numdur) {
        c.numdur = numdur;
    }

    public static void colors(Car c1, Car c2) {
        Car c3 = c1;
        c1 = c2;
        c2 = c3;
        System.out.println(c1.color);
        System.out.println(c2.color);
    }

    public static void main(String[] args) {
            CarTest ct = new CarTest();
            Car c1 = new Car("Red", "Ford", 5);
            Car c2 = new Car("Blue", "Ford", 3);
            ct.numnum(c1, 3);
            ct.colors(c1, c2);
        System.out.println("1 машина: " + c1.color + c1.model + c1.numdur);
        System.out.println("2 машина: " + c2.color + c2.model + c2.numdur);
    }
}

