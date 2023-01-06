package interceptingFilterPattern;

public class Target {
    public void execute(HttpRequest httpRequest){
        System.out.println("execute request successful !");
    }
}
