package proxyPattern1;

public class InternetAccess implements  OfficeInternetAccess{
    String employeeName;

    public InternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Employee has  access internet :" + this.employeeName);
    }
}
