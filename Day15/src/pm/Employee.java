package pm;

/**
 * ClassName:Employee
 * Package: pm
 * Description:
 *
 * @Author Neko
 * @Create 18/8/20232:24 pm
 * @Version 1.0
 */

//设计类的时候提供getter,setter方法，属性看情况调private



public class Employee {
    String name;
    double salary;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double bonus;

    public Manager() {
    }

    public Manager(String name) {
        this.name = name;
    }

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return salary + bonus;
    }

}

class Developer extends Employee {
    int hoursWorked;
    double hourlyWage;

    public Developer() {
    }

    public Developer(String name) {
        this.name = name;
    }

    public Developer(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Developer(String name, int hoursWorked, double hourlyWage) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }

}

class Test01 {
    public static void main(String[] args) {
        Manager mm = new Manager("death God", 999.9, 99);
        Developer dp = new Developer("big brother", 70, 200);
        System.out.println(mm.calculateSalary());
        System.out.println(dp.calculateSalary());
    }
}