package work1;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class wooo {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", 45000));
        list.add(new Employee(102, "Amit", 55000));
        list.add(new Employee(103, "Neha", 60000));

        System.out.println("Employee Details:");

        for (Employee e : list) {
            e.display();
        }
    }
}