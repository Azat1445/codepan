package Full0DoMaster.list2;

class Employee{
    int id;
    String surname;
    int age;
    double salary;
    String department;


    double salary(){
        return salary;
    }
    void info(){
        salary *= 2;
        System.out.println("Увеличение зарплаты: " + salary);
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.surname = "Petr";
        e1.age = 18;
        e1.salary = 10000;
        e1.department = "Engineering";

        System.out.println(" Id : " + e1.id + " Familia : " + e1.surname + " Age : " + e1.age + " Salary: " + e1.salary + " Department : " + e1.department);
        e1.info();

        Employee e2 = new Employee();
        e2.id = 2;
        e2.surname = "Dmitry";
        e2.age = 27;
        e2.salary = 3200.67;
        e2.department = "It technical";

        System.out.println("Id Worker: " + e2.id + " Familia Worker: " + e2.surname + " Age Worker: " + e2.age + " Salary: " + e2.salary + " Department Worker: " + e2.department);
        e2.info();
    }

}
