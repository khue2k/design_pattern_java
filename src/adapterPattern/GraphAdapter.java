package adapterPattern;

//cái này gọi là adapter giúp chuyển từ tọa độ cực sang tọa độ của máy tính hiểu được là flashBack
public class GraphAdapter implements  Graph {

    private  PolarGraph polarGraph;
    @Override
    public void point(double x, double y) {
        double a=Math.atan(y/x);
        double r=Math.sqrt(x*x+y*y);
        PolarGraph.point(a,r);
    }
}
