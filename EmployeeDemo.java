package MatrixRotation;

import java.util.*;

class Employeeeee {
    int id;
    String name;
    double salary;

    Employeeeee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        ArrayList<Employeeeee> empList = new ArrayList<>();

        empList.add(new Employeeeee(101, "Rahul", 50000));
        empList.add(new Employeeeee(102, "Amit", 60000));
        empList.add(new Employeeeee(103, "Neha", 55000));

        for (Employeeeee e : empList) {
            e.display();
        }
    }
}