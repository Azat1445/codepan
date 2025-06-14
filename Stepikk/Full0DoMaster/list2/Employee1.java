package Full0DoMaster.list2;

public class Employee1 {
    Employee1 (int id2, String surname2, int age2) {
        this(id2,surname2,age2,0.0,null);
    }
    Employee1(String surname3, int age3) {
        this(0,surname3,age3,0.0,null);
    }
    Employee1 (int id4, String surname4, int age4, double salary4, String department4) {
      id = id4;
      surname = surname4;
      age = age4;
      salary = salary4;
      department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class Employee1Test {
    public static void main(String[] args) {
        Employee1 emp = new Employee1(5,"Petrov", 31);
        System.out.println(emp.surname);
        Employee1 emp2 = new Employee1("Ivanov", 22);
        System.out.println(emp2);
        Employee1 emp3 = new Employee1(2,"Ivanov", 22, 35.100, "IT");
        System.out.println(emp3);
    }

}