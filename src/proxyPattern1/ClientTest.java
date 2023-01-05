package proxyPattern1;

public class ClientTest {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess=new ProxyInternetAccess("duong");
        officeInternetAccess.grantInternetAccess();

    }
}
