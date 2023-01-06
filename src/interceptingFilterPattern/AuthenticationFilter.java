package interceptingFilterPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AuthenticationFilter implements  Filter{
    private boolean pass=false;


    //in memory database
    private static List<User> userList=new ArrayList<>();

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
    protected static Boolean findUser(User user){
        Iterator<User> iterator= userList.listIterator();
        while (iterator.hasNext()){
            User user1=iterator.next();
            if(user1.getUsername()==user.getUsername()&&user1.getPassword()==user.getPassword()){
                return true;
            }
        }
        return false;
    }
    @Override
    public void doFilter(HttpRequest httpRequest) {
        if(!findUser(httpRequest.getUser())){

            System.out.println("Authentication failed !");
        }
        else {
            pass=true;
            System.out.println("Authentication success !");
            System.out.println("Hello "+httpRequest.getUser().getUsername());
        }
    }

    @Override
    public boolean pass() {
        if(pass)
            return true;
        return false;
    }
}
