package adapterPattern;

import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("enter x,y :");
            double x= scanner.nextDouble();
            double y= scanner.nextDouble();
            Graph graph=new GraphAdapter();
            graph.point(x,y);
        }
    }
}
