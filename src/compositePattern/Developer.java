package compositePattern;

import java.util.ArrayList;

public class Developer extends Employee{

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void remove(Employee employee) {

    }

    @Override
    public void print() {
        System.out.println("#######################");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary: "+this.salary);

    }
}
