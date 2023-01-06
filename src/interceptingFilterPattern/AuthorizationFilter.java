package interceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

public class AuthorizationFilter implements Filter {

    //in memory database
    private static List<User> userList = new ArrayList<>();

    static {
        User user1 = new BuildUser()
                .setId(11)
                .setUsername("admin123")
                .setPassword("123")
                .setRole("ADMIN")
                .build();

        User user2 = new BuildUser()
                .setId(12)
                .setUsername("user123")
                .setPassword("123")
                .setRole("USER")
                .build();

        userList.add(user1);
        userList.add(user2);

    }

    @Override
    public void doFilter(HttpRequest httpRequest) {
        String username=httpRequest.getUser().getUsername();
        String role=httpRequest.getUser().getRole();
        System.out.println("Authorization successful !");
        System.out.println("Hello "+username+" ,you have authorization :"+role);
    }

    @Override
    public boolean pass() {
        return true;
    }
}
