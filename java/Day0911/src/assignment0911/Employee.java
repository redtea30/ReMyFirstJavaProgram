package src.assignment0911;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Test {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 20, 10000);
        Employee emp2 = new Employee("rock", 30, 8000);
        Employee emp3 = new Employee("jean", 40, 6012);
        Employee emp4 = new Employee("james", 21, 8032);
        Employee emp5 = new Employee("wang", 30, 6012);
        Employee emp6 = new Employee("king", 32, 8222);
        Employee emp7 = new Employee("robin", 45, 9456);
        HashMap<Integer, Employee> newEmployees = new HashMap<>();
        newEmployees.put(1, emp1);
        newEmployees.put(2, emp2);
        newEmployees.put(3, emp3);
        newEmployees.put(4, emp4);
        newEmployees.put(5, emp5);
        newEmployees.put(6, emp6);
        newEmployees.put(7, emp7);

        Stream<Map.Entry<Integer, Employee>> stream = newEmployees.entrySet().stream();
        //排序后的新数组
        Stream<Map.Entry<Integer, Employee>> sorted = stream.sorted(new Comparator<Map.Entry<Integer, Employee>>() {
            @Override
            public int compare(Map.Entry<Integer, Employee> o1, Map.Entry<Integer, Employee> o2) {
                return -(int) (o1.getValue().getSalary() - o2.getValue().getSalary()); //这里应该可以用compareTo
            }
        });

        sorted.forEach(new Consumer<Map.Entry<Integer, Employee>>() {
            int count = 3;

            @Override
            public void accept(Map.Entry<Integer, Employee> integerEmployeeEntry) {
                if (count-- > 0) {
                    System.out.println(integerEmployeeEntry.getValue());
                }
            }
        });


    }


}
