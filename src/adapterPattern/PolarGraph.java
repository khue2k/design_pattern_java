package adapterPattern;

//đây gọi là class Adaptee ,class này sẽ đáp ứng yêu cầu của client  nhưng hiểu theo cách cái adapter nó truyền lại,và nhận được rồi in kết quả ra màn hình
public class PolarGraph {
    private static double a,r;
    public static void point( double a, double r){
        System.out.println("polar point: ");
        System.out.println("degree: "+Math.toDegrees(a));
        System.out.println("radius: "+r);
    }

    public PolarGraph(double a, double r) {
        this.a=a;
        this.r=r;
    }
}
