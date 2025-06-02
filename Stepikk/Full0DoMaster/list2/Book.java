package Full0DoMaster.list2;

//понять через время

public class Book {
    // --- Поля --------------------------------------------------------------
    private int id;
    private String title;
    private String author;
    private double price;
    private boolean isBorrowed;

    // --- Конструктор 1: полный --------------------------------------------
    public Book(int id, String title, String author, double price, boolean isBorrowed) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isBorrowed = isBorrowed;
    }

    // --- Конструктор 2: короткий ------------------------------------------
    public Book(int id, String title, String author) {
        this(id, title, author, 0, false);   // делегируем первому
    }

    // --- Методы -----------------------------------------------------------
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Книга выдана ✅");
        } else {
            System.out.println("Книга уже на руках ⚠️");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Книга возвращена ✅");
        } else {
            System.out.println("Эта книга и так в библиотеке ⚠️");
        }
    }

    public void applyDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Процент скидки должен быть от 0 до 100");
            return;
        }
        price -= price * (percent / 100.0);
        System.out.printf("Новая цена после %.1f%%-скидки: %.2f ₽%n", percent, price);
    }

    public void printInfo() {
        System.out.printf("Book{id=%d, title='%s', author='%s', price=%.2f ₽, borrowed=%b}%n",
                id, title, author, price, isBorrowed);
    }
}
class BookTest {
    public static void main(String[] args) {
        // 1) полный конструктор
        Book full = new Book(1, "Effective Java", "Joshua Bloch", 3500, false);
        // 2) короткий конструктор
        Book shortVersion = new Book(2, "Clean Code", "Robert C. Martin");

        // Выводим стартовые данные
        full.printInfo();
        shortVersion.printInfo();

        // Пытаемся выдать и вернуть
        full.borrowBook();   // выдаём
        full.borrowBook();   // пробуем снова
        full.returnBook();   // возвращаем

        // Делаем скидку второй книге
        shortVersion.applyDiscount(15);
        shortVersion.printInfo();
    }
}
