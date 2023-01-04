package builderPattern;

public class Person {
    private Integer id;
    private  String firstName;
    private String lastName;
    private int age;
    private String address;
    private boolean active;

    public Person(Integer id, String firstName, String lastName, int age, String address, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", active=" + active +
                '}';
    }
}
