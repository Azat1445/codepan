package Full0DoMaster.TestsandDz;

import java.sql.SQLOutput;

public class Rectangle {
    int width = 1;
    int height = 1;

    Rectangle() {
        System.out.println("Прямоугольник 1х1 создан");
    }

    Rectangle(int w, int h) {
        if (w > 0 && h > 0){
            width = w;
            height = h;
        } else {
            System.out.println("Неверный размер, ставлю 1х1");
        }
    }

    int area() {
        return width * height;
    }
    int perimeter() {
        return 2 * (width * height);
    }
    void show() {
        System.out.println("Ширина: " + width+" "+ "высота: " + height);
    }
}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.show();
        System.out.println("S=" + r1.area());

        Rectangle r2 = new Rectangle(3,4);
        r2.show();
        System.out.println("S=" + r2.perimeter());

        Rectangle r3 = new Rectangle(-1,5);
        r3.show();
    }
}
//ДобавлениеСтатический счётчик
//Добавь static int totalRectangles, увеличивай его в каждом конструкторе и показывай, сколько всего прямоугольников создано.
//
//Метод resize(int dw, int dh)
//Увеличивает ширину и высоту на заданные приращения, если итоговые значения остаются > 0.
//
//Метод boolean isSquare()
//Возвращает true, если width == height.
// // Rectangle.java
//public class Rectangle {
//    /* ---------- ПОЛЯ -------------------------------------------------- */
//    private int width  = 1;          // нестатические: принадлежат КАЖДОМУ прямоугольнику
//    private int height = 1;
//
//    private static int totalRectangles = 0; // статическое: ОБЩЕЕ для всех
//
//    /* ---------- КОНСТРУКТОРЫ ------------------------------------------ */
//    // 1. Пустой
//    public Rectangle() {
//        totalRectangles++;           // считаем экземпляр
//        System.out.println("Прямоугольник 1×1 создан");
//    }
//
//    // 2. С параметрами
//    public Rectangle(int w, int h) {
//        if (w > 0 && h > 0) {
//            width  = w;
//            height = h;
//        } else {
//            System.out.println("Неверный размер, ставлю 1×1");
//        }
//        totalRectangles++;           // тоже считаем экземпляр
//    }
//
//    /* ---------- МЕТОДЫ-ВОПРОСЫ ---------------------------------------- */
//    public int area() {
//        return width * height;
//    }
//
//    public int perimeter() {
//        return 2 * (width + height);
//    }
//
//    /** Возвращает true, если стороны равны */
//    public boolean isSquare() {
//        return width == height;
//    }
//
//    /** Статический геттер общего счётчика */
//    public static int getTotalRectangles() {
//        return totalRectangles;
//    }
//
//    /* ---------- МЕТОД-ДЕЙСТВИЕ ---------------------------------------- */
//    /** Увеличивает размеры на dw/dh; возвращает true, если успех */
//    public boolean resize(int dw, int dh) {
//        int newW = width  + dw;
//        int newH = height + dh;
//
//        if (newW > 0 && newH > 0) {
//            width  = newW;
//            height = newH;
//            return true;
//        } else {
//            System.out.println("Resize отклонён: итоговые размеры ≤ 0");
//            return false;
//        }
//    }
//
//    /* ---------- СЕРВИСНЫЙ МЕТОД -------------------------------------- */
//    public void show() {
//        System.out.println("Ширина: " + width + ", высота: " + height);
//    }
//}
//// RectangleTest.java
//public class RectangleTest {
//    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle();        // 1×1
//        Rectangle r2 = new Rectangle(3, 4);    // 3×4
//        Rectangle r3 = new Rectangle(-2, 5);   // некорректный → 1×1
//
//        System.out.println("\n── Информация ──");
//        r1.show(); r2.show(); r3.show();
//
//        System.out.println("\n── Площади и периметры ──");
//        System.out.println("r2: S=" + r2.area() + ", P=" + r2.perimeter());
//
//        System.out.println("\n── isSquare ──");
//        System.out.println("r1 квадрат? " + r1.isSquare());
//        System.out.println("r2 квадрат? " + r2.isSquare());
//
//        System.out.println("\n── resize r2 (+2,-1) ──");
//        r2.resize(2, -1);   // 5×3
//        r2.show();
//
//        System.out.println("\nВсего прямоугольников создано: "
//                           + Rectangle.getTotalRectangles());
//    }
//}