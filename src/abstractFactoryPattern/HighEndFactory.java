package abstractFactoryPattern;

public class HighEndFactory extends ElectronicDeviceAbstractFactory{

    @Override
    Phone getPhone() {
        return new HighEndPhone();
    }

    @Override
    Laptop getLaptop() {
        return new HighEndLaptop();
    }
}
