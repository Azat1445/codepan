package Full0DoMaster.list2;

public class BankAccount2 {
    int id;
    String name;
    double balance;

    double popolnenieScheta (double summaPopoln){
        balance += summaPopoln;
        return summaPopoln;
    }

    double snyatieSoScheta(double summaSnyatie){
        if (balance >= summaSnyatie){}
        balance -= summaSnyatie;
        return summaSnyatie;
    }
    void infoPopolnenieScheta(){
        System.out.println("Ваш баланс пополнен на сумму: " + balance);
    }
    void infoSnyatieSoScheta(){
        System.out.println("Ваш баланс был уменьшен, остаток на счету:" + balance);
    }
    static class BankAccount2Test{
        public static void main(String[] args) {
            BankAccount2 c1 = new BankAccount2();
            c1.id = 2;
            c1.name ="Petr";
            c1.balance = 10000;

            System.out.println("Id: " + c1.id + " Name: " + c1.name + " Balance: " + c1.balance);
            c1.popolnenieScheta(5000);
            c1.infoPopolnenieScheta();
            c1.snyatieSoScheta(50);
            c1.infoSnyatieSoScheta();
            System.out.println("Текущий баланс:" + c1.balance);
        }
    }
}

