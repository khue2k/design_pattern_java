package abstractFactoryPattern;

import abstractFactoryPartern.Shape;

public class Main {
    public static void main(String[] args) {
        ElectronicDeviceAbstractFactory abstractFactory1=ElectronicDeviceFactory.getFactory(Segment.HIGH_END);
        ElectronicDeviceAbstractFactory abstractFactory2=ElectronicDeviceFactory.getFactory(Segment.MID_RANGE);
        System.out.println(abstractFactory1.getPhone().getSegment());
        System.out.println(abstractFactory1.getLaptop().getSegment());
    }
}
