package nullPattern;

public class NullTax implements  Tax{
    private final String country="UNKNOWN_COUNTRY";

    @Override
    public String getCountry() {
        return  country;
    }

    @Override
    public double apply(double price) {
        return price*1;
    }
}
