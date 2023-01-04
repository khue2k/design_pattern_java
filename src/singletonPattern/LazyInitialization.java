package singletonPattern;

public class LazyInitialization {
    private String name;
    private  static  LazyInitialization INSTANCE;

    private LazyInitialization() {

    }
    public  static  LazyInitialization getInstance(){
        if(INSTANCE==null){
            return new LazyInitialization();
        }
        return INSTANCE;
    }
}
