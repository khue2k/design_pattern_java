package compositePattern;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, double salary) {
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
