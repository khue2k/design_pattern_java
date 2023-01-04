package factoryPattern;

public class Main {
    public static void main(String[] args) {
        Candy candy1=SingleCandyFactory.getCandy("HARD_CANDY");
        Candy candy2=SingleCandyFactory.getCandy("MINTY_CANDY");
        System.out.println("candy1 name: "+candy1.getCandyName());
        System.out.println("candy1 name: "+candy2.getCandyName());
    }
}
