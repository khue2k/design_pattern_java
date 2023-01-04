package builderPattern;

public class ClientTest {
    public static void main(String[] args) {
        Person person=new BuildPerson()
                .setId(12)
                .setFirstName("Duong Xuan ")
                .setLastName("Khue")
                .setAge(23)
                .build();
        System.out.println(person.toString());
    }
}
