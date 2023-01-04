package abstractFactoryPattern;

public class ElectronicDeviceFactory {
   static ElectronicDeviceAbstractFactory getFactory(Segment segment){
       switch (segment){
           case HIGH_END:
               return new HighEndFactory();
           case MID_RANGE:
               return new MidRangeFactory();
           default:
               return null;
       }
   }
}
