package nullPattern;

import java.util.HashMap;
import java.util.Map;

public class TaxFactory {
    private  static final  Map<String,Double> VATS=new HashMap<>();
    static {
        VATS.put("VIET_NAM",1.1);
        VATS.put("SINGAPORE",1.2);
        VATS.put("THAI_LAN",1.3);
        VATS.put("CHINA",1.05);
    }
    public static Tax getCountry(String country){
        Double vat= VATS.get(country);
        if(vat!=null){
            return new RealTax(country,vat);
        }
        return new NullTax();
    }
}
