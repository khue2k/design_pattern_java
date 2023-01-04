package abstractFactoryPattern;

public class MidRangeFactory extends ElectronicDeviceAbstractFactory{

    @Override
    Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    Laptop getLaptop() {
        return new MidRangeLaptop();
    }
}
