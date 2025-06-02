package Full0DoMaster.list2;

public class Human {
    String name;
    Car3 car;
    BankAccount1 bA;

    void info(){
        System.out.println("Name: " + name + "color car: " +car.color+ "Balance:" + bA.balance);

    }
}
class HumanTest{

    public static void main(String[] args) {
    Human h = new Human();
    h.name = "Jack";
    h.car = new Car3("red", "V8");
    h.bA = new BankAccount1(18, 200.56);
    h.info();
    }
}


class Car3{
    Car3(String c, String e){
        color=c;
        engine=e;

    }
    String color;
    String engine;
}


class BankAccount1 {
    BankAccount1(int id2, double balance2){

    id=id2;
    balance=balance2;
    }
int id;
double balance;

}
