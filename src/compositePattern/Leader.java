package compositePattern;

import java.util.ArrayList;

public class Leader extends Employee{
    private ArrayList<Employee> employeeList=new ArrayList<>();
    public Leader(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("#######################");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary: "+this.salary);
        employeeList.forEach( employee -> employee.print());
    }
}
