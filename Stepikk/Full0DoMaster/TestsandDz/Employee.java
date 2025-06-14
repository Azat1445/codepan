package Full0DoMaster.TestsandDz;

public class Employee {
    private double salary;
    public String surname;
    int id;
    void showsalary(){
        System.out.println(salary);
    }
    void showsurname(){
        System.out.println(surname);
    }
    void showid(){
        System.out.println(id);
    }

    public Employee(double salary1, String surname1, int id1) {
        salary = salary1;
        surname = surname1;
        id = id1;
        System.out.println("ID: " + id + "\n" + "Фамилия: " + surname + "\n" + "Зарплата: " + salary);
    }

    Employee (String surname2, int id2,double salary2){
        salary = salary2;
        surname = surname2;
        id = id2;
        System.out.println("ID: " + id2 + "\n" + "Surname: " + surname2 + "\n" + "Salary: " + salary2);
    }

    private Employee (int id3,double salary3, String surname3){
        salary = salary3;
        surname = surname3;
        id = id3;
        System.out.println("ID: " + id3 + "\n" + "Surname: " + surname3 + "\n" + "Salary: " + salary3);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(25000, "Ivanov",5);
        employee1.showsalary();
        employee1.showsurname();
        employee1.showid();
    }
}

