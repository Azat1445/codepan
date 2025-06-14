package Full0DoMaster.TestsandDz;

public class Circle {
    private double radius = 1.0;

    Circle() {
        System.out.println("Круг r=1 создан");
    }

    Circle(double r) {
        if (r > 0) {
            radius = r;
            System.out.println("Круг r=" + radius + " создан");
        } else {
            System.out.println("Некорректный радиус, r=1");
        }
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double length() {
        return 2 * Math.PI * radius;
    }

    boolean enlarge(double dr) {
        double newRadius = radius + dr;
        if (newRadius > 0) {
            radius = newRadius;
            return true;
        } else {
            return false;
        }
    }

    void show(){
        System.out.println("Радиус: " + radius);
    }
}
class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.show();

        System.out.println("Площадь: " + c.area());
        System.out.println("Длина окружности: " + c.length());

        if (c.enlarge(10)) {
            System.out.println("Радиус успешно увеличили");
        }
        c.show();

        if (!c.enlarge(-15)) {     // попытка сделать радиус ≤ 0
            System.out.println("Ошибка enlarge: итоговый r ≤ 0");
        }
        c.show();
    }
}
