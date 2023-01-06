package nullPattern;

import java.util.logging.Logger;

public class TestClient {
    public static void main(String[] args) {
       Tax taxInVietNam=TaxFactory.getCountry("VIET_NAM");
       Tax taxInUSA=TaxFactory.getCountry("USA");
        System.out.println(taxInVietNam.getCountry()+" "+taxInVietNam.apply(100));
        System.out.println(taxInUSA.getCountry()+" "+taxInUSA.apply(200));
    }
}
