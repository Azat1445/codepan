package Full0DoMaster.TestsandDz;

public class ClickCounter {
    int count;

    ClickCounter() {
        count = 0;
        System.out.println("Счетчик создан");
    }

    void click() {
        count++;
        System.out.println("Клик! Всего: " + count);
    }

    void reset(){
        count = 0;
        System.out.println("Сброшено");
    }

    void show(){
        System.out.println("Текущий клик: " + count);
    }
}
class ClickCounterTest{
    public static void main(String[] args) {
        ClickCounter cl = new ClickCounter();
        cl.click();
        cl.show();
        cl.reset();
        cl.show();

    }
}