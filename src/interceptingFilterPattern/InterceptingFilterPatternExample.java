package interceptingFilterPattern;


public class InterceptingFilterPatternExample {

    public static void main(String[] args) {
        User user1 = new BuildUser()
                .setId(11)
                .setUsername("admin1234")
                .setPassword("123")
                .setRole("ADMIN")
                .build();

        User user2 = new BuildUser()
                .setId(12)
                .setUsername("user123")
                .setPassword("123")
                .setRole("USER")
                .build();

        HttpRequest httpRequest1 = new HttpRequest();
        httpRequest1.setTargetUrl("/home");
        httpRequest1.setClientIp("127.0.0.1");
        httpRequest1.setUser(user1);

        HttpRequest httpRequest2 = new HttpRequest();
        httpRequest2.setClientIp("127.0.0.1");
        httpRequest2.setTargetUrl("/home");
        httpRequest2.setUser(user2);


        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new AuthorizationFilter());
        System.out.println("ADMIN send request.....");
        filterManager.filterRequest(httpRequest1);
        System.out.println("#####################");
        System.out.println("USER send request......");
        filterManager.filterRequest(httpRequest2);
    }
}
