package proxyPattern;

public class RealImage implements Image{
    protected String url;

    public RealImage(String url) {
        this.url = url;
    }

    @Override
    public void load() {
        System.out.println("load image from :"+this.url);
    }
}
