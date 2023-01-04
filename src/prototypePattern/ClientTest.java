package prototypePattern;

public class ClientTest {
    public static void main(String[] args) {

        User user1=new User("khue","khue123","123");
        User user2=user1.clone();
        System.out.println("user1: "+user1);
        System.out.println("user2: "+user2);
        System.out.println("##############");
        user1.setUsername("van");
        System.out.println("user1: "+user1);
        System.out.println("user2: "+user2);

    }
}
