package facadePattern;

public class ClientTest {
    public static void main(String[] args) {
        FurnitureFacade furnitureFacade=FurnitureFacade.getInstance();
        System.out.println("######################");
        furnitureFacade.makeTableAndChair();
        furnitureFacade.makeTelevisionAndTable();
    }
}
