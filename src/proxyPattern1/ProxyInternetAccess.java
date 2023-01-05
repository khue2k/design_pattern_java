package proxyPattern1;

public class ProxyInternetAccess implements OfficeInternetAccess {
    String employeeName;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    InternetAccess internetAccess;
    @Override
    public void grantInternetAccess() {
        if(internetAccess==null){
            internetAccess=new InternetAccess(employeeName);
        }
        else {
            System.out.println("internet access already exist !");
        }
        internetAccess.grantInternetAccess();
    }
}
