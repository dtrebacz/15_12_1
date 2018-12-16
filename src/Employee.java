import java.awt.*;
import java.util.Objects;


public class Employee {

    public static void main(String[] args) {

        Employee e1 = new Employee("kowalski", 32, 2345);
        Employee e2 = new Employee("Adamska", 32, 2345);
        Employee e3 = new Employee("kowalski", 32, 2345);
        Manager mn = new Manager("kowalski", 32, 2345,800);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e3);
        System.out.println(mn);

        if (mn.equals(e2)) {
            System.out.println("Ta sama osoba!!!");

        } else
            System.out.println("rozne osoby");
    }




    String name;
    int age;
    int salary;

    public Employee(){}

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;


    }

//     public String toString(){
//
//        return this.getClass().getName() + "Imie i nazwisko: " + name + "Wiek: " + age + "Zarobki: " + salary;
//    }


    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return age == employee1.age &&
                salary == employee1.salary &&
                Objects.equals(name, employee1.name);
    }



}

class Manager extends Employee{

    int slaryBonus;

    public Manager(String name, int age, int salary, int slaryBonus) {
        super(name, age, salary);
        this.slaryBonus = slaryBonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", slaryBonus=" + slaryBonus +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return slaryBonus == manager.slaryBonus;
    }


}