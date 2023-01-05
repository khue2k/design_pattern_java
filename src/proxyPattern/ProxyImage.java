package proxyPattern;

public class ProxyImage implements Image{
    private  String url;
    private RealImage realImage;

    public ProxyImage(String url) {
        this.url = url;
    }

    @Override
    public void load() {
        if(realImage==null){
            realImage=new RealImage(url);
        }
        else{
            System.out.println("Real Image already exist !");
        }
        realImage.load();
    }
}
