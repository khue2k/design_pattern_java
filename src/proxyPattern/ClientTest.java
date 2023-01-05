package proxyPattern;

public class ClientTest {
    public static void main(String[] args) {
        Image image0=new ProxyImage("khue123");
        Image image1=new ProxyImage("khue123");
        image1.load();
    }
}
