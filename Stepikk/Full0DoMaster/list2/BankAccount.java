package Full0DoMaster.list2;

public class BankAccount {
     int id;
     String name;
     double balance;
}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="John";
        MyAccount.balance=17.9;

        YourAccount.id=37;
        YourAccount.name="Nick";
        YourAccount.balance=1700.56;

        HisAccount.id=159;
        HisAccount.name="Mike";
        HisAccount.balance=547.9;

        System.out.println(MyAccount.id);

    }
}