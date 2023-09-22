package interatorPattern;

public class Main {
    public static void main(String[] args) {
        Integer[] integers=new Integer[]{1,2,3,4,5,6};
        Iterator<Integer> iterator=new IteratorImpl<>(integers);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
