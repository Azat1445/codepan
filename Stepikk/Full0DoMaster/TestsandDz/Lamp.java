package Full0DoMaster.TestsandDz;

import java.sql.SQLOutput;

public class Lamp {
    boolean isOn;

    Lamp() {
        isOn = false;
        System.out.println("Лампочка создана (состояние: выключена)");
    }

    void turnOn() {
        isOn = true;
        System.out.println("Включена");
    }

    void turnOff() {
        isOn = false;
        System.out.println("Выключена");
    }

    void showState() {
        if (isOn) {
            System.out.println("Сейчас лампа горит");
        } else {
            System.out.println("Сейчас лампа погашена");
        }
    }
}
class LampTest{
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.showState();
        lamp.turnOn();
        lamp.showState();
        lamp.turnOff();
        lamp.showState();
    }
}
