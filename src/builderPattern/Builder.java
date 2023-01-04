package builderPattern;

public interface Builder {
    Builder setId(Integer id);
    Builder setFirstName(String firstName);
    Builder setLastName(String lastName);
    Builder setAge(int age);
    Builder setActive(boolean active);
    Builder setAddress(String address);
    Person build();
}
