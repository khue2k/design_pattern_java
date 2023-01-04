package builderPattern;

public class BuildPerson implements Builder {
    private Integer id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private boolean active;

    @Override
    public Builder setId(Integer id) {
        this.id=id;
        return this;
    }

    @Override
    public Builder setFirstName(String firstName) {
        this.firstName=firstName;
        return this;
    }

    @Override
    public Builder setLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        this.age=age;
        return this;
    }

    @Override
    public Builder setActive(boolean active) {
        this.active=active;
        return this;
    }

    @Override
    public Builder setAddress(String address) {
        this.address=address;
        return this;
    }

    @Override
    public Person build() {
        return new Person(id,firstName,lastName,age,address,active);
    }
}
