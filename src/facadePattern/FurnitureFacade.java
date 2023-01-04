package facadePattern;

public class FurnitureFacade {
    private  static FurnitureFacade instance;
    private Furniture table;
    private Furniture television;
    private Furniture chair;

    private FurnitureFacade() {
        table=new Table();
        television=new Television();
        chair=new Chair();
    }


    public static FurnitureFacade getInstance(){
        if(instance==null)
            return new FurnitureFacade();
        return instance;
    }
    public void makeTableAndChair(){
       table.make();
       chair.make();
    }
    public void makeTelevisionAndTable(){
        television.make();
        table.make();
    }

}
