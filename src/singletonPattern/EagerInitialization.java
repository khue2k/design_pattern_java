package singletonPattern;

public class EagerInitialization {
    private String name;
    private final static EagerInitialization INSTANCE = new EagerInitialization();

    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {

        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
